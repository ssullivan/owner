/*
 * Copyright (c) 2013, Luigi R. Viggiano
 * All rights reserved.
 *
 * This software is distributable under the BSD license.
 * See the terms of the BSD license in the documentation provided with this software.
 */

package org.aeonbits.owner;

/**
 * @author luigi
 */
public class ValueOf {
    private String text;

    private ValueOf() {
    }

    public static ValueOf valueOf(String text) {
        ValueOf result = new ValueOf();
        result.text = text;
        return result;
    }

    @Override
    public String toString() {
        return text;
    }
}
