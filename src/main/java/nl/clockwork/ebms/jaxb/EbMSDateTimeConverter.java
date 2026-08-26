/**
 * Copyright 2011 Clockwork
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.clockwork.ebms.jaxb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.xml.bind.DatatypeConverter;

public class EbMSDateTimeConverter
{
	private static boolean digipoortPatch;

	/**
	 * Some senders erroneously use '.' instead of ':' as the separator between hours, minutes and
	 * seconds in the time part of an xs:dateTime value, e.g. "2026-08-19T11.38.14Z" instead of
	 * "2026-08-19T11:38:14Z". DatatypeConverter.parseDateTime() throws an exception on such a
	 * value, which JAXB's default ValidationEventHandler silently swallows, leaving the
	 * Timestamp field null. Normalize this known malformed format before parsing.
	 */
	private static final Pattern DOTTED_TIME_SEPARATOR = Pattern.compile("(\\d{4}-\\d{2}-\\d{2}T\\d{2})\\.(\\d{2})\\.(\\d{2})");

	public static Date parseDateTime(String date)
	{
		return DatatypeConverter.parseDateTime(normalizeTimeSeparators(date)).getTime();
	}

	private static String normalizeTimeSeparators(String date)
	{
		if (date == null)
			return null;
		Matcher matcher = DOTTED_TIME_SEPARATOR.matcher(date);
		return matcher.find() ? matcher.replaceFirst("$1:$2:$3") : date;
	}

	public static String printDateTime(Date date)
	{
		if (digipoortPatch)
		{
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
			df.setTimeZone(TimeZone.getTimeZone("GMT"));
			return df.format(date);
		}
		else
		{
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			return DatatypeConverter.printDateTime(calendar);
		}
	}

	public static void setDigipoortPatch(boolean digipoortPatch)
	{
		EbMSDateTimeConverter.digipoortPatch = digipoortPatch;
	}
}
