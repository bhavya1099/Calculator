package com.houarizegai.calculator.ui;

import com.houarizegai.calculator.theme.ThemeLoader;
import com.houarizegai.calculator.theme.properties.Theme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUITest {

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
        assertNotNull(themesMap);
        assertEquals(themesMap, calculatorUI.getThemesMap());
    }

}
