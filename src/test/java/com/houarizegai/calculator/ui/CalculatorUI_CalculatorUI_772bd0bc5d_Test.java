import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.houarizegai.calculator.ui.CalculatorUI;
import com.houarizegai.calculator.theme.Theme;
import com.houarizegai.calculator.theme.ThemeLoader;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorUI_CalculatorUI_772bd0bc5d_Test {

    @Mock
    private ThemeLoader themeLoader;

    private CalculatorUI calculatorUI;

    @BeforeEach
    public void setup() {
        calculatorUI = new CalculatorUI();
    }

    @Test
    public void testWindowInitialization() {
        assertEquals("APPLICATION_TITLE", calculatorUI.getTitle());
        assertEquals(WINDOW_WIDTH, calculatorUI.getWidth());
        assertEquals(WINDOW_HEIGHT, calculatorUI.getHeight());
        assertFalse(calculatorUI.isResizable());
        assertEquals(JFrame.EXIT_ON_CLOSE, calculatorUI.getDefaultCloseOperation());
        assertTrue(calculatorUI.isVisible());
    }

    @Test
    public void testThemeLoading() {
        when(themeLoader.loadThemes()).thenReturn(new HashMap<>());
        calculatorUI.initThemeSelector();
        verify(themeLoader).loadThemes();
    }

    @Test
    public void testCalculatorTypeSelectorInitialization() {
        assertNotNull(calculatorUI.getComboCalculatorType());
        assertEquals(2, calculatorUI.getComboCalculatorType().getItemCount());
        assertEquals("Standard", calculatorUI.getComboCalculatorType().getItemAt(0));
        assertEquals("Scientific", calculatorUI.getComboCalculatorType().getItemAt(1));
    }

    @Test
    public void testInputScreenAndButtonsInitialization() {
        assertNotNull(calculatorUI.getInputScreen());
        assertNotNull(calculatorUI.getBtn0());
        assertNotNull(calculatorUI.getBtn1());
        assertNotNull(calculatorUI.getBtn2());
        assertNotNull(calculatorUI.getBtn3());
        assertNotNull(calculatorUI.getBtn4());
        assertNotNull(calculatorUI.getBtn5());
        assertNotNull(calculatorUI.getBtn6());
        assertNotNull(calculatorUI.getBtn7());
        assertNotNull(calculatorUI.getBtn8());
        assertNotNull(calculatorUI.getBtn9());
        assertNotNull(calculatorUI.getBtnPoint());
        assertNotNull(calculatorUI.getBtnEqual());
        assertNotNull(calculatorUI.getBtnRoot());
        assertNotNull(calculatorUI.getBtnPower());
        assertNotNull(calculatorUI.getBtnLog());
    }

    @Test
    public void testLayoutSetting() {
        assertNull(calculatorUI.getLayout());
    }

    @Test
    public void testThemeApplication() {
        Theme theme = new Theme();
        theme.setApplicationBackground("#FFFFFF");
        theme.setTextColor("#000000");
        theme.setNumbersBackground("#CCCCCC");
        theme.setOperatorBackground("#DDDDDD");
        theme.setBtnEqualBackground("#EEEEEE");
        theme.setBtnEqualTextColor("#111111");

        Map<String, Theme> themesMap = new HashMap<>();
        themesMap.put("White", theme);

        when(themeLoader.loadThemes()).thenReturn(themesMap);
        
        calculatorUI.applyTheme(theme);

        assertEquals(new Color(255, 255, 255), calculatorUI.getContentPane().getBackground());
        assertEquals(new Color(204, 204, 204), calculatorUI.getBtn0().getBackground());
        assertEquals(new Color(221, 221, 221), calculatorUI.getBtnAdd().getBackground());
        assertEquals(new Color(238, 238, 238), calculatorUI.getBtnEqual().getBackground());
    }
}
