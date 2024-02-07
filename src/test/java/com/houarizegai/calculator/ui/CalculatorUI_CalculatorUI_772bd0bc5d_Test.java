import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.lang.reflect.Field;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {
    private CalculatorUI calculatorUI;

    @BeforeEach
    public void setUp() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testCalculatorUI() throws NoSuchFieldException, IllegalAccessException {
        assertNotNull(calculatorUI);

        // Test window setup
        Field windowField = CalculatorUI.class.getDeclaredField("window");
        windowField.setAccessible(true);
        JFrame window = (JFrame) windowField.get(calculatorUI);

        assertNotNull(window);
        assertEquals("Calculator", window.getTitle());
        assertEquals(410, window.getWidth());
        assertEquals(600, window.getHeight());
        assertNull(window.getLocation());
        assertNull(window.getLayout());
        assertFalse(window.isResizable());
        assertEquals(JFrame.EXIT_ON_CLOSE, window.getDefaultCloseOperation());
        assertTrue(window.isVisible());

        // Test themesMap
        Field themesMapField = CalculatorUI.class.getDeclaredField("themesMap");
        themesMapField.setAccessible(true);
        Map<String, UIManager.LookAndFeelInfo> themesMap = (Map<String, UIManager.LookAndFeelInfo>) themesMapField.get(calculatorUI);

        assertNotNull(themesMap);

        // Test columns and rows
        int[] columns = {20, 20 + 90, 20 + 90 * 2, 20 + 90 * 3, 20 + 90 * 4};
        int[] rows = {60, 60 + 100, 60 + 100 + 80, 60 + 100 + 80 * 2, 60 + 100 + 80 * 3, 60 + 100 + 80 * 4};

        assertNotNull(columns);
        assertEquals(5, columns.length);
        assertArrayEquals(new int[] {20, 20 + 90, 20 + 90 * 2, 20 + 90 * 3, 20 + 90 * 4}, columns);

        assertNotNull(rows);
        assertEquals(6, rows.length);
        assertArrayEquals(new int[] {60, 60 + 100, 60 + 100 + 80, 60 + 100 + 80 * 2, 60 + 100 + 80 * 3, 60 + 100 + 80 * 4}, rows);
    }
}
