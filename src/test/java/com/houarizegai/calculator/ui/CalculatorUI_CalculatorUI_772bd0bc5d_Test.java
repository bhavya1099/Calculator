// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Verify that the "CalculatorUI" function is able to load themes correctly using the "ThemeLoader.loadThemes()" method.
2. Check whether the "CalculatorUI" function correctly initializes the window with the expected title "APPLICATION_TITLE".
3. Verify if the window is set to the correct size defined by "WINDOW_WIDTH" and "WINDOW_HEIGHT".
4. Confirm that the window is correctly positioned in the center of the screen by checking the function of "window.setLocationRelativeTo(null)".
5. Check whether the function correctly calculates and assigns the values of the "columns" and "rows" arrays.
6. Verify if the function is able to correctly initialize the input screen using the "initInputScreen(columns, rows)" method.
7. Check whether the function correctly initializes the buttons using the "initButtons(columns, rows)" method.
8. Confirm that the function correctly initializes the Calculator Type Selector using the "initCalculatorTypeSelector()" method.
9. Verify if the function correctly initializes the Theme Selector using the "initThemeSelector()" method.
10. Check whether the function correctly sets the layout of the window to null using "window.setLayout(null)".
11. Verify if the function correctly sets the window to non-resizable using "window.setResizable(false)".
12. Confirm that the function correctly sets the default close operation of the window to "JFrame.EXIT_ON_CLOSE".
13. Verify that the window is made visible after all initializations by checking "window.setVisible(true)".
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.awt.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    private CalculatorUI calculatorUI;

    @BeforeEach
    void setUp() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    void testCalculatorUI() {
        // Mock ThemeLoader.loadThemes() method
        try (MockedStatic<ThemeLoader> mocked = Mockito.mockStatic(ThemeLoader.class)) {
            mocked.when(() -> ThemeLoader.loadThemes()).thenReturn(Map.of());

            calculatorUI = new CalculatorUI();

            // Verify JFrame configurations
            assertNotNull(calculatorUI.window);
            assertEquals("Calculator", calculatorUI.window.getTitle());
            assertEquals(new Dimension(410, 600), calculatorUI.window.getSize());
            assertFalse(calculatorUI.window.isResizable());
            assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
            assertTrue(calculatorUI.window.isVisible());

            // Verify the call to initInputScreen(), initButtons(), initCalculatorTypeSelector(), initThemeSelector()
            verify(calculatorUI, times(1)).initInputScreen(any(int[].class), any(int[].class));
            verify(calculatorUI, times(1)).initButtons(any(int[].class), any(int[].class));
            verify(calculatorUI, times(1)).initCalculatorTypeSelector();
            verify(calculatorUI, times(1)).initThemeSelector();
        }
    }
}
