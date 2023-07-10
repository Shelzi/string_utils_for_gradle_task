package com.shelzi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        Assertions.assertEquals(true, StringUtils.isPositiveNumber("12"));
    }

    @Test
    void isPositiveNumber1() {
        Assertions.assertEquals(false, StringUtils.isPositiveNumber("-32"));
    }
}