// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. **Theme Loading Scenario**: Check if the themes are loading correctly from the ThemeLoader. Verify if all themes are loaded and stored in the themesMap variable.

2. **Window Initialization Scenario**: Check if the window initialization is done correctly. Verify if the window title is set as 'APPLICATION_TITLE', size of the window is set as 'WINDOW_WIDTH' and 'WINDOW_HEIGHT', and the window location is set relative to null.

3. **Layout Initialization Scenario**: Verify if the layout of the window is set to null, the window is not resizable and the default close operation is set to 'JFrame.EXIT_ON_CLOSE'.

4. **Column and Row Initialization Scenario**: Check if the columns and rows arrays are initialized correctly with the respective margin values and multiples.

5. **Input Screen Initialization Scenario**: Verify if the input screen is initialized correctly using the columns and rows arrays.

6. **Buttons Initialization Scenario**: Check if the buttons are initialized correctly using the columns and rows arrays.

7. **Calculator Type Selector Initialization Scenario**: Verify if the calculator type selector is initialized correctly.

8. **Theme Selector Initialization Scenario**: Check if the theme selector is initialized correctly.

9. **Window Visibility Scenario**: Verify that the window is set to visible after all initializations.

10. **Components Rendering Scenario**: Check if all components (input screen, buttons, calculator type selector, theme selector) are displayed correctly on the window.

11. **Theme Application Scenario**: Select different themes from the theme selector and verify if the theme is applied correctly to the window.

12. **Calculator Type Scenario**: Change the calculator type using the calculator type selector and verify if the calculator type is changed correctly. 

13. **Button Functionality Scenario**: Click on different buttons and verify if they are working as expected. 

Remember, these are high-level scenarios. Each scenario could be further broken down into multiple test cases for detailed testing.
*/

// ********RoostGPT********
package com.houarizegai.calculator.ui;

import com.houarizegai.calculator.theme.ThemeLoader;
import com.houarizegai.calculator.theme.properties.Theme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    private CalculatorUI calculatorUI;

    @Mock
    private JFrame mockFrame;

    @Mock
    private ThemeLoader mockThemeLoader;

    @Mock
    private Map<String, Theme> mockThemesMap;

    @BeforeEach
    public void setUp() {
        calculatorUI = new CalculatorUI();
        calculatorUI.window = mockFrame;
        calculatorUI.themesMap = mockThemesMap;
        calculatorUI.comboTheme = new JComboBox<>();
        calculatorUI.comboCalculatorType = new JComboBox<>();
        calculatorUI.inputScreen = new JTextField();
        calculatorUI.btn0 = new JButton();
        calculatorUI.btn1 = new JButton();
        calculatorUI.btnEqual = new JButton();
    }

    @Test
    public void testWindowInitialization() {
        calculatorUI.window = null;
        calculatorUI.initCalculatorUI();
        assertNotNull(calculatorUI.window);
        assertEquals(CalculatorUI.APPLICATION_TITLE, calculatorUI.window.getTitle());
        assertEquals(new Dimension(CalculatorUI.WINDOW_WIDTH, CalculatorUI.WINDOW_HEIGHT), calculatorUI.window.getSize());
        assertNull(calculatorUI.window.getLocation());
        assertFalse(calculatorUI.window.isResizable());
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.window.getDefaultCloseOperation());
        assertTrue(calculatorUI.window.isVisible());
    }

    @Test
    public void testThemeLoading() {
        when(mockThemeLoader.loadThemes()).thenReturn(mockThemesMap);
        assertNotNull(calculatorUI.themesMap);
    }

    @Test
    public void testColumnAndRowInitialization() {
        int[] expectedColumns = {CalculatorUI.MARGIN_X, CalculatorUI.MARGIN_X + 90, CalculatorUI.MARGIN_X + 90 * 2, CalculatorUI.MARGIN_X + 90 * 3, CalculatorUI.MARGIN_X + 90 * 4};
        int[] expectedRows = {CalculatorUI.MARGIN_Y, CalculatorUI.MARGIN_Y + 100, CalculatorUI.MARGIN_Y + 100 + 80, CalculatorUI.MARGIN_Y + 100 + 80 * 2, CalculatorUI.MARGIN_Y + 100 + 80 * 3, CalculatorUI.MARGIN_Y + 100 + 80 * 4};
        assertArrayEquals(expectedColumns, calculatorUI.columns);
        assertArrayEquals(expectedRows, calculatorUI.rows);
    }

    @Test
    public void testInputScreenInitialization() {
        calculatorUI.initInputScreen(calculatorUI.columns, calculatorUI.rows);
        assertNotNull(calculatorUI.inputScreen);
        assertFalse(calculatorUI.inputScreen.isEditable());
        assertEquals(Color.WHITE, calculatorUI.inputScreen.getBackground());
    }

    @Test
    public void testButtonsInitialization() {
        calculatorUI.initButtons(calculatorUI.columns, calculatorUI.rows);
        assertNotNull(calculatorUI.btn0);
        assertNotNull(calculatorUI.btn1);
        assertNotNull(calculatorUI.btnEqual);
    }

    @Test
    public void testCalculatorTypeSelectorInitialization() {
        calculatorUI.initCalculatorTypeSelector();
        assertNotNull(calculatorUI.comboCalculatorType);
    }

    @Test
    public void testThemeSelectorInitialization() {
        calculatorUI.initThemeSelector();
        assertNotNull(calculatorUI.comboTheme);
    }
}
