package nl.clockwork.ebms.jaxb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Instant;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EbMSDateTimeConverterTest
{
	@Test
	void parsesWellFormedTimestamp()
	{
		Date date = EbMSDateTimeConverter.parseDateTime("2026-08-19T11:38:14Z");
		assertNotNull(date);
		assertEquals(Instant.parse("2026-08-19T11:38:14Z"), date.toInstant());
	}

	@Test
	void parsesTimestampWithDottedTimeSeparators()
	{
		// Some senders erroneously use '.' instead of ':' in the time part, e.g. NHN systems
		// forwarding signal messages. This must not result in a null Timestamp.
		Date date = EbMSDateTimeConverter.parseDateTime("2026-08-19T11.38.14Z");
		assertNotNull(date);
		assertEquals(Instant.parse("2026-08-19T11:38:14Z"), date.toInstant());
	}
}
