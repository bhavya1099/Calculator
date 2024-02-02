// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Test Scenario: Verify if the Calculator UI launches successfully.
   - Steps: Launch the Calculator UI.
   - Expected Result: The Calculator UI should launch successfully without any exceptions or errors.

2. Test Scenario: Verify if the Calculator UI window size is set correctly.
   - Steps: Launch the Calculator UI and check its size.
   - Expected Result: The Calculator UI window size should be equal to the defined WINDOW_WIDTH and WINDOW_HEIGHT.

3. Test Scenario: Verify if the Calculator UI window is centered on the screen.
   - Steps: Launch the Calculator UI and check its position.
   - Expected Result: The Calculator UI window should be centered on the screen.

4. Test Scenario: Verify if the Calculator UI window layout is set to null.
   - Steps: Launch the Calculator UI and check the layout.
   - Expected Result: The Calculator UI window layout should be null.

5. Test Scenario: Verify if the Calculator UI window is not resizable.
   - Steps: Launch the Calculator UI and try to resize the window.
   - Expected Result: The Calculator UI window should not be resizable.

6. Test Scenario: Verify if the Calculator UI window closes when the close button is clicked.
   - Steps: Launch the Calculator UI and click the close button.
   - Expected Result: The Calculator UI window should close successfully.

7. Test Scenario: Verify if the Calculator UI window is visible after launch.
   - Steps: Launch the Calculator UI.
   - Expected Result: The Calculator UI window should be visible.

8. Test Scenario: Verify if the Calculator UI window's default close operation is set to EXIT_ON_CLOSE.
   - Steps: Launch the Calculator UI and check the default close operation.
   - Expected Result: The Calculator UI window's default close operation should be set to JFrame.EXIT_ON_CLOSE.

9. Test Scenario: Verify if the themes are loaded correctly.
   - Steps: Launch the Calculator UI and check the themes.
   - Expected Result: The themes should be loaded correctly as per the ThemeLoader.loadThemes() method.

10. Test Scenario: Verify if the Calculator UI window's title is set correctly.
    - Steps: Launch the Calculator UI and check the window's title.
    - Expected Result: The Calculator UI window's title should be equal to the defined APPLICATION_TITLE.
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.houarizegai.calculator.theme.ThemeLoader;
import com.houarizegai.calculator.theme.properties.Theme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {
    private CalculatorUI calculatorUI;

    @BeforeEach
    public void setUp() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testCalculatorUILaunch() {
        assertDoesNotThrow(() -> new CalculatorUI());
    }

    @Test
    public void testCalculatorUIWindowSize() {
        assertEquals(calculatorUI.WINDOW_WIDTH, calculatorUI.window.getWidth());
        assertEquals(calculatorUI.WINDOW_HEIGHT, calculatorUI.window.getHeight());
    }

    @Test
    public void testCalculatorUIWindowPosition() {
        Point expectedLocation = new Point((Toolkit.getDefaultToolkit().getScreenSize().width - calculatorUI.WINDOW_WIDTH) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - calculatorUI.WINDOW_HEIGHT) / 2);
        assertEquals(expectedLocation, calculatorUI.window.getLocation());
    }

    @Test
    public void testCalculatorUIWindowLayout() {
        assertNull(calculatorUI.window.getLayout());
    }

    @Test
    public void testCalculatorUIWindowResizable() {
        assertFalse(calculatorUI.window.isResizable());
    }

    @Test
    public void testCalculatorUIWindowCloseOperation() {
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
    }

    @Test
    public void testCalculatorUIWindowVisibility() {
        assertTrue(calculatorUI.window.isVisible());
    }

    @Test
    public void testThemesLoading() throws IOException {
        JavaPropsMapper mapper = new JavaPropsMapper();
        Map<String, Theme> expectedThemesMap = mapper.readValue(ThemeLoader.class.getResourceAsStream("/themes/themes.properties"), Map.class);
        assertEquals(expectedThemesMap, calculatorUI.themesMap);
    }

    @Test
    public void testCalculatorUIWindowTitle() {
        assertEquals(calculatorUI.APPLICATION_TITLE, calculatorUI.window.getTitle());
    }
}
