package com.houarizegai.calculator.ui;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.awt.Dimension;
import java.awt.Point;
import com.houarizegai.calculator.theme.properties.Theme;
import com.houarizegai.calculator.theme.ThemeLoader;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.Map;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;
import static com.houarizegai.calculator.util.ColorUtil.hex2Color;

public class CalculatorUiCalculatorUiTest {
    private CalculatorUI calculatorUI;
    private ThemeLoader themeLoader;
    @BeforeEach
    public void setup() {
        themeLoader = Mockito.mock(ThemeLoader.class);
        calculatorUI = Mockito.spy(new CalculatorUI());
    }
    @Test
    public void testWindowProperties() {
        Dimension windowSize = calculatorUI.window.getSize();
        Point windowLocation = calculatorUI.window.getLocation();
        boolean isLayoutSpecified = calculatorUI.window.getLayout() != null;
        boolean isResizable =  calculatorUI.window.isResizable();
        assertEquals(calculatorUI.WINDOW_WIDTH, windowSize.getWidth());
        assertEquals(calculatorUI.WINDOW_HEIGHT, windowSize.getHeight());
        assertEquals(new Point(), windowLocation);
        assertTrue(isLayoutSpecified);
        assertFalse(isResizable);
    }
    @Test
    public void testThemeLoading() {
        assertNotNull(calculatorUI.themesMap);
        verify(themeLoader, times(1)).loadThemes();
    }
    @Test
    public void testWindowVisibility() {
        assertTrue(calculatorUI.window.isVisible());
    }
    @Test
    public void testJFrameCloseOperation() {
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
    }
    @Test
    public void testUIInitializationMethods() {
        verify(calculatorUI, times(1)).initInputScreen(anyInt(), anyInt());
        verify(calculatorUI, times(1)).initButtons(anyInt(), anyInt());
        verify(calculatorUI, times(1)).initCalculatorTypeSelector();
        verify(calculatorUI, times(1)).initThemeSelector();
    }
}