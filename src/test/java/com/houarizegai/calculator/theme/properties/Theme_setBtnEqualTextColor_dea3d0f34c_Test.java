// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Scenario: Check if the function correctly sets the color when a valid color code is passed.
   Test Steps: 
   - Call the setBtnEqualTextColor function with a valid color code like "#FFFFFF".
   - Check if the btnEqualTextColor variable has been correctly set to "#FFFFFF".

2. Scenario: Check if the function handles null input correctly.
   Test Steps: 
   - Call the setBtnEqualTextColor function with null as the input.
   - Check if the btnEqualTextColor variable has been correctly set to null or default color.

3. Scenario: Check if the function handles empty string input correctly.
   Test Steps: 
   - Call the setBtnEqualTextColor function with "" as the input.
   - Check if the btnEqualTextColor variable has been correctly set to default color or remains unchanged.

4. Scenario: Check if the function handles invalid color code correctly.
   Test Steps: 
   - Call the setBtnEqualTextColor function with an invalid color code like "XYZ123".
   - Check if the btnEqualTextColor variable has been correctly set to default color or remains unchanged.

5. Scenario: Check if the function handles color names correctly.
   Test Steps: 
   - Call the setBtnEqualTextColor function with a valid color name like "blue".
   - Check if the btnEqualTextColor variable has been correctly set to the equivalent color code of "blue".

6. Scenario: Check if the function handles case sensitivity correctly.
   Test Steps: 
   - Call the setBtnEqualTextColor function with a valid color code in different cases like "#ffffff" and "#FFFFFF".
   - Check if the btnEqualTextColor variable has been correctly set in both cases.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Theme_setBtnEqualTextColor_dea3d0f34c_Test {

    private Theme theme;

    @BeforeEach
    public void setup() {
        theme = new Theme();
    }

    @Test
    public void testSetBtnEqualTextColor_ValidColor() {
        String validColor = "#FFFFFF";
        theme.setBtnEqualTextColor(validColor);
        Assertions.assertEquals(validColor, theme.getBtnEqualTextColor());
    }

    @Test
    public void testSetBtnEqualTextColor_NullColor() {
        theme.setBtnEqualTextColor(null);
        Assertions.assertNull(theme.getBtnEqualTextColor());
    }

    @Test
    public void testSetBtnEqualTextColor_EmptyColor() {
        theme.setBtnEqualTextColor("");
        Assertions.assertEquals("", theme.getBtnEqualTextColor());
    }

    @Test
    public void testSetBtnEqualTextColor_InvalidColor() {
        String invalidColor = "XYZ123";
        theme.setBtnEqualTextColor(invalidColor);
        Assertions.assertEquals(invalidColor, theme.getBtnEqualTextColor());
    }

    @Test
    public void testSetBtnEqualTextColor_ValidColorName() {
        String validColorName = "blue";
        theme.setBtnEqualTextColor(validColorName);
        Assertions.assertEquals(validColorName, theme.getBtnEqualTextColor());
    }

    @Test
    public void testSetBtnEqualTextColor_CaseSensitivity() {
        String lowerCaseColor = "#ffffff";
        String upperCaseColor = "#FFFFFF";
        theme.setBtnEqualTextColor(lowerCaseColor);
        Assertions.assertEquals(lowerCaseColor, theme.getBtnEqualTextColor());
        theme.setBtnEqualTextColor(upperCaseColor);
        Assertions.assertEquals(upperCaseColor, theme.getBtnEqualTextColor());
    }
}
