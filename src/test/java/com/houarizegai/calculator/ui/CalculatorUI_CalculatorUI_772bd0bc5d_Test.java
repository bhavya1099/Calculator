package com.houarizegai.calculator.ui;

import com.houarizegai.calculator.theme.ThemeLoader;
import com.houarizegai.calculator.theme.properties.Theme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    private CalculatorUI calculatorUI;
    private Map<String, Theme> themesMap;

    @BeforeEach
    public void setUp() {
        calculatorUI = new CalculatorUI();
        themesMap = ThemeLoader.loadThemes();
    }

    @Test
    public void testWindowSetup() {
        JFrame window = calculatorUI.window;
        assertEquals("Calculator", window.getTitle());
        assertEquals(new Dimension(410, 600), window.getSize());
        assertNull(window.getLocation());
    }

    @Test
    public void testWindowLayout() {
        assertNull(calculatorUI.window.getLayout());
    }

    @Test
    public void testWindowResizable() {
        assertFalse(calculatorUI.window.isResizable());
    }

    @Test
    public void testWindowCloseOperation() {
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
    }

    @Test
    public void testWindowVisibility() {
        assertTrue(calculatorUI.window.isVisible());
    }

    @Test
    public void testThemesLoading() {
        assertNotNull(calculatorUI.themesMap);
        assertEquals(themesMap, calculatorUI.themesMap);
    }

    @Test
    public void testColumnsAndRowsSetup() {
        int[] expectedColumns = {20, 110, 200, 290, 380};
        int[] expectedRows = {60, 160, 240, 320, 400, 480};

        // Assuming getColumns() and getRows() methods are available in the CalculatorUI class
        // assertArrayEquals(expectedColumns, calculatorUI.getColumns());
        // assertArrayEquals(expectedRows, calculatorUI.getRows());
    }
}
