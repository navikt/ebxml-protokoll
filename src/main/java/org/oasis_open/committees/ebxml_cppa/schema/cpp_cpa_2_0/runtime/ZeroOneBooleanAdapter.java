/*
 * Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.oasis_open.committees.ebxml_cppa.schema.cpp_cpa_2_0.runtime;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Serializes {@code boolean} as 0 or 1.
 *
 * @author Kohsuke Kawaguchi
 * @since 2.0
 */
public class ZeroOneBooleanAdapter extends XmlAdapter<String,Boolean> {
    public Boolean unmarshal(String v) {
        if(v==null)     return null;
        return DatatypeConverter.parseBoolean(v);
    }

    public String marshal(Boolean v) {
        if(v==null)     return null;
        if(v) {
            return "1";
        } else {
            return "0";
        }
    }
}
