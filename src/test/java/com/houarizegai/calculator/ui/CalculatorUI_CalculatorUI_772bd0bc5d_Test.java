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

7. Test Scenario: Verify if any exceptions are thrown during the initialization
    - Check if any exceptions are thrown during the initialization of the CalculatorUI

8. Test Scenario: Verify the functionality of the application after the CalculatorUI is initialized
    - Check if the calculator is functional after the CalculatorUI is initialized, this includes checking if buttons work as expected, if the calculator type selector works as expected, and if the theme selector works as expected.
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import com.houarizegai.calculator.theme.ThemeLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    private CalculatorUI calculatorUI;

    @Mock
    private ThemeLoader themeLoader;

    @BeforeEach
    public void setup() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testCalculatorUI_initialization() {
        String expectedTitle = "Calculator";
        Dimension expectedSize = new Dimension(410, 600);
        assertNull(calculatorUI.window.getLocation());
        assertNull(calculatorUI.window.getLayout());
        assertFalse(calculatorUI.window.isResizable());
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
        assertTrue(calculatorUI.window.isVisible());

        assertEquals(expectedTitle, calculatorUI.window.getTitle());
        assertEquals(expectedSize, calculatorUI.window.getSize());
    }

    @Test
    public void testCalculatorUI_themesMapIsLoaded() {
        when(themeLoader.loadThemes()).thenReturn(null);

        assertNotNull(calculatorUI.themesMap);
    }

    @Test
    public void testCalculatorUI_initInputScreen() {
        int[] columns = {20, 20 + 90, 20 + 90 * 2, 20 + 90 * 3, 20 + 90 * 4};
        int[] rows = {60, 60 + 100, 60 + 100 + 80, 60 + 100 + 80 * 2, 60 + 100 + 80 * 3, 60 + 100 + 80 * 4};

        calculatorUI.initInputScreen(columns, rows);

        assertEquals("0", calculatorUI.inputScreen.getText());
    }

    @Test
    public void testCalculatorUI_initButtons() {
        int[] columns = {20, 20 + 90, 20 + 90 * 2, 20 + 90 * 3, 20 + 90 * 4};
        int[] rows = {60, 60 + 100, 60 + 100 + 80, 60 + 100 + 80 * 2, 60 + 100 + 80 * 3, 60 + 100 + 80 * 4};

        calculatorUI.initButtons(columns, rows);

        assertNotNull(calculatorUI.btnC);
        assertNotNull(calculatorUI.btnBack);
        assertNotNull(calculatorUI.btnMod);
        assertNotNull(calculatorUI.btnDiv);
        assertNotNull(calculatorUI.btnMul);
        assertNotNull(calculatorUI.btnSub);
        assertNotNull(calculatorUI.btnAdd);
        assertNotNull(calculatorUI.btn0);
        assertNotNull(calculatorUI.btn1);
        assertNotNull(calculatorUI.btn2);
        assertNotNull(calculatorUI.btn3);
        assertNotNull(calculatorUI.btn4);
        assertNotNull(calculatorUI.btn5);
        assertNotNull(calculatorUI.btn6);
        assertNotNull(calculatorUI.btn7);
        assertNotNull(calculatorUI.btn8);
        assertNotNull(calculatorUI.btn9);
        assertNotNull(calculatorUI.btnPoint);
        assertNotNull(calculatorUI.btnEqual);
        assertNotNull(calculatorUI.btnRoot);
        assertNotNull(calculatorUI.btnPower);
        assertNotNull(calculatorUI.btnLog);
    }
}
