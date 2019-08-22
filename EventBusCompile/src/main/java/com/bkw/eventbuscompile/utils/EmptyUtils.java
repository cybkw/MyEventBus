package com.bkw.eventbuscompile.utils;

import java.util.Collection;
import java.util.Map;

public class EmptyUtils {

    public static boolean isEmpty(CharSequence c) {
        return c == null || c.length() == 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }
}
