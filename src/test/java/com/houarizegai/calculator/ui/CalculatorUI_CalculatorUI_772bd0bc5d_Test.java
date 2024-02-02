// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Test Scenario: Verify that the CalculatorUI window is correctly initialized
    - Check if the window title is set to "APPLICATION_TITLE"
    - Check if the window size is set to "WINDOW_WIDTH" and "WINDOW_HEIGHT"
    - Check if the window location is set to the center of the screen
    - Check if the window layout is set to null
    - Check if the window is not resizable
    - Check if the window default close operation is set to "EXIT_ON_CLOSE"
    - Check if the window is visible after initialization

2. Test Scenario: Verify that the themesMap is correctly loaded from ThemeLoader
    - Check if the themesMap is not null after calling ThemeLoader.loadThemes()

3. Test Scenario: Verify the initialization of the input screen
    - Check if the input screen is initialized with the correct columns and rows

4. Test Scenario: Verify the initialization of the buttons
    - Check if the buttons are initialized with the correct columns and rows

5. Test Scenario: Verify the initialization of the calculator type selector
    - Check if the calculator type selector is correctly initialized

6. Test Scenario: Verify the initialization of the theme selector
    - Check if the theme selector is correctly initialized

7. Test Scenario: Verify if the columns and rows have the correct values
    - Check if the columns and rows are correctly calculated based on the margin values

Please note that these are just the scenarios, the exact implementation would depend on the specific test framework and libraries used.
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    @Test
    public void testCalculatorUI() {
        ThemeLoader themeLoaderMock = Mockito.mock(ThemeLoader.class);
        when(themeLoaderMock.loadThemes()).thenReturn(new HashMap<>());

        CalculatorUI calculatorUI = new CalculatorUI();

        assertEquals(calculatorUI.window.getTitle(), "Calculator");
        assertEquals(calculatorUI.window.getSize().getWidth(), 410);
        assertEquals(calculatorUI.window.getSize().getHeight(), 600);
        assertTrue(calculatorUI.window.isVisible());
        assertFalse(calculatorUI.window.isResizable());
        assertEquals(calculatorUI.window.getDefaultCloseOperation(), JFrame.EXIT_ON_CLOSE);
        assertNotNull(calculatorUI.themesMap);
        assertNotNull(calculatorUI.inputScreen);
        assertNotNull(calculatorUI.comboCalculatorType);
        assertNotNull(calculatorUI.comboTheme);
        assertNotNull(calculatorUI.btnC);
        assertNotNull(calculatorUI.btnBack);
        assertNotNull(calculatorUI.btnMod);
        assertNotNull(calculatorUI.btnDiv);
        assertNotNull(calculatorUI.btn7);
        assertNotNull(calculatorUI.btn8);
        assertNotNull(calculatorUI.btn9);
        assertNotNull(calculatorUI.btnMul);
        assertNotNull(calculatorUI.btn4);
        assertNotNull(calculatorUI.btn5);
        assertNotNull(calculatorUI.btn6);
        assertNotNull(calculatorUI.btnSub);
        assertNotNull(calculatorUI.btn1);
        assertNotNull(calculatorUI.btn2);
        assertNotNull(calculatorUI.btn3);
        assertNotNull(calculatorUI.btnAdd);
        assertNotNull(calculatorUI.btnPoint);
        assertNotNull(calculatorUI.btn0);
        assertNotNull(calculatorUI.btnEqual);
        assertNotNull(calculatorUI.btnRoot);
        assertNotNull(calculatorUI.btnPower);
        assertNotNull(calculatorUI.btnLog);
    }
}
