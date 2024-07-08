package com.houarizegai.calculator.util;
import java.awt.*;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ColorUtilHex2ColorTest {
    @Test
    @DisplayName("Test for Valid Hexadecimal String Input")
    void testForValidHexadecimalStringInput() {
        String input = "FFA500";
        Color expectedOutput = new Color(255,165,0);
        Assertions.assertEquals(expectedOutput, ColorUtil.hex2Color(input));
    }
    @Test
    @DisplayName("Test for Null String Input")
    void testForNullStringInput() {
        String input = null;
        Color expectedOutput = null;
        Assertions.assertEquals(expectedOutput, ColorUtil.hex2Color(input));
    }
    @Test
    @DisplayName("Test for Non-Hexadecimal String Input")
    void testForNonHexadecimalStringInput() {
        String input = "ZZZZZZ";
        Assertions.assertThrows(NumberFormatException.class, () -> ColorUtil.hex2Color(input));
    }
    @Test
    @DisplayName("Test for Incorrect Length of Hexadecimal String")
    void testForIncorrectLengthOfHexadecimalString() {
        String input = "FFA5";
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> ColorUtil.hex2Color(input));
    }
}