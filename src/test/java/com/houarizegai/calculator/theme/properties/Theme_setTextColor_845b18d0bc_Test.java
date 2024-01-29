// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Scenario: Test when the textColor parameter is set to a valid color value.
Expected Result: The textColor should be updated to the specified color.

2. Scenario: Test when the textColor parameter is set to an empty string.
Expected Result: The textColor should not be updated, or an error should be thrown depending on the business logic.

3. Scenario: Test when the textColor parameter is set to a null value.
Expected Result: The textColor should not be updated, or an error should be thrown depending on the business logic.

4. Scenario: Test when the textColor parameter is set to a non-existent color.
Expected Result: The textColor should not be updated, or an error should be thrown depending on the business logic.

5. Scenario: Test when the textColor parameter is set to a color value containing special characters.
Expected Result: The textColor should not be updated, or an error should be thrown depending on the business logic.

6. Scenario: Test when the textColor parameter is set to a color value containing numbers.
Expected Result: The textColor should not be updated, or an error should be thrown depending on the business logic.

7. Scenario: Test when the textColor parameter is set to a color value in different case (lowercase, uppercase, mixed).
Expected Result: The textColor should be updated to the specified color, and the function handles the case correctly.

8. Scenario: Test when the textColor parameter is set to a color value in different formats (RGB, Hex, etc.)
Expected Result: The textColor should be updated to the specified color if the function supports the format, or an error should be thrown if it doesn't.

9. Scenario: Test when the textColor is set multiple times with different valid colors.
Expected Result: The textColor should always reflect the last valid color set.

10. Scenario: Test the textColor before and after calling the function with a valid color.
Expected Result: Initially, the textColor should have its default value, and after calling the function, it should reflect the new color.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Theme_setTextColor_845b18d0bc_Test {
    private Theme theme;

    @BeforeEach
    public void setup() {
        theme = new Theme();
    }

    @Test
    public void testSetTextColor_ValidColor() {
        String newColor = "#FFFFFF";
        theme.setTextColor(newColor);
        assertEquals(newColor, theme.getTextColor());
    }

    @Test
    public void testSetTextColor_EmptyString() {
        String newColor = "";
        assertThrows(IllegalArgumentException.class, () -> theme.setTextColor(newColor));
    }

    @Test
    public void testSetTextColor_NullColor() {
        assertThrows(NullPointerException.class, () -> theme.setTextColor(null));
    }

    @Test
    public void testSetTextColor_NonExistentColor() {
        String newColor = "NonExistentColor";
        assertThrows(IllegalArgumentException.class, () -> theme.setTextColor(newColor));
    }

    @Test
    public void testSetTextColor_SpecialCharacters() {
        String newColor = "#$%&";
        assertThrows(IllegalArgumentException.class, () -> theme.setTextColor(newColor));
    }

    @Test
    public void testSetTextColor_NumberColor() {
        String newColor = "123456";
        assertThrows(IllegalArgumentException.class, () -> theme.setTextColor(newColor));
    }

    @Test
    public void testSetTextColor_DifferentCase() {
        String newColor = "#ffffff";
        theme.setTextColor(newColor);
        assertEquals(newColor.toUpperCase(), theme.getTextColor());
    }

    @Test
    public void testSetTextColor_DifferentFormat() {
        String newColor = "rgb(255,255,255)";
        assertThrows(IllegalArgumentException.class, () -> theme.setTextColor(newColor));
    }

    @Test
    public void testSetTextColor_MultipleValidColors() {
        String firstColor = "#FFFFFF";
        String secondColor = "#000000";
        theme.setTextColor(firstColor);
        theme.setTextColor(secondColor);
        assertEquals(secondColor, theme.getTextColor());
    }

    @Test
    public void testSetTextColor_BeforeAfterValidColor() {
        String defaultColor = theme.getTextColor();
        String newColor = "#FFFFFF";
        theme.setTextColor(newColor);
        assertNotEquals(defaultColor, theme.getTextColor());
        assertEquals(newColor, theme.getTextColor());
    }
}
