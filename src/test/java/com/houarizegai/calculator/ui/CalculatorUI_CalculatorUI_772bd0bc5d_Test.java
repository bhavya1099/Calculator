import javax.swing.*;
import java.awt.*;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorUI_CalculatorUI_772bd0bc5d_Test {
    private CalculatorUI calculatorUI;

    @BeforeEach
    void setUp() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    void testWindowSetup() {
        JFrame window = calculatorUI.getWindow();
        assertNotNull(window);
        assertEquals(CalculatorUI.APPLICATION_TITLE, window.getTitle());
        assertEquals(CalculatorUI.WINDOW_WIDTH, window.getWidth());
        assertEquals(CalculatorUI.WINDOW_HEIGHT, window.getHeight());
        assertEquals(null, window.getLocationOnScreen());
        assertFalse(window.isResizable());
        assertEquals(JFrame.EXIT_ON_CLOSE, window.getDefaultCloseOperation());
        assertTrue(window.isVisible());
    }

    @Test
    void testThemesMapLoading() {
        Map<String, String> themesMap = calculatorUI.getThemesMap();
        assertNotNull(themesMap);
        assertTrue(themesMap instanceof Map);
        // TODO: Add expected themes to the array and uncomment the line below
        // assertArrayEquals(new String[]{"theme1", "theme2"}, themesMap.keySet().toArray());
    }

    @Test
    void testWindowLayout() {
        LayoutManager layout = calculatorUI.getWindow().getLayout();
        assertNull(layout);
    }

    @Test
    void testColumnsAndRowsCalculation() {
        int[] columns = calculatorUI.getColumns();
        int[] rows = calculatorUI.getRows();

        assertNotNull(columns);
        assertNotNull(rows);

        assertEquals(5, columns.length);
        assertEquals(6, rows.length);

        assertArrayEquals(new int[]{CalculatorUI.MARGIN_X, CalculatorUI.MARGIN_X + 90, CalculatorUI.MARGIN_X + 90 * 2, CalculatorUI.MARGIN_X + 90 * 3, CalculatorUI.MARGIN_X + 90 * 4}, columns);
        assertArrayEquals(new int[]{CalculatorUI.MARGIN_Y, CalculatorUI.MARGIN_Y + 100, CalculatorUI.MARGIN_Y + 100 + 80, CalculatorUI.MARGIN_Y + 100 + 80 * 2, CalculatorUI.MARGIN_Y + 100 + 80 * 3, CalculatorUI.MARGIN_Y + 100 + 80 * 4}, rows);
    }
}
