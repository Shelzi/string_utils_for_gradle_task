package com.shelzi;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    private StringUtils() {
    }

    static boolean isPositiveNumber(String str) {
        if (NumberUtils.isDigits(str)) {
            return Integer.parseInt(str) > 0;
        }
        return false;
    }
}