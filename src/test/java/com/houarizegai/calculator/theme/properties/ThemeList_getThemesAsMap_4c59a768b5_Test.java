// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Test Scenario: Validate that the getThemesAsMap() method returns a non-null Map object when the themes list is not empty.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly converts the list of themes into a Map object and returns a non-null Map object when the themes list is not empty.

2. Test Scenario: Validate that the getThemesAsMap() method returns an empty Map when the themes list is empty.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles the case where the list of themes is empty and returns an empty Map.

3. Test Scenario: Validate that the getThemesAsMap() method correctly maps theme names to corresponding Theme objects.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly converts the list of themes into a Map object, with theme names as keys and corresponding Theme objects as values.

4. Test Scenario: Validate that the getThemesAsMap() method correctly handles duplicate theme names in the themes list.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly handles the case where there are duplicate theme names in the themes list. In this case, the last occurrence of the duplicate theme should be in the resulting Map.

5. Test Scenario: Validate that the getThemesAsMap() method throws a NullPointerException when the themes list is null.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly throws a NullPointerException when the themes list is null.

6. Test Scenario: Validate that the getThemesAsMap() method throws a NullPointerException when a theme in the themes list is null.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly throws a NullPointerException when a theme in the themes list is null.

7. Test Scenario: Validate that the getThemesAsMap() method throws a NullPointerException when a theme's name in the themes list is null.
   Description: This test scenario is to validate that the getThemesAsMap() method correctly throws a NullPointerException when a theme's name in the themes list is null.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThemeList_getThemesAsMap_4c59a768b5_Test {

    private ThemeList themeList;

    @BeforeEach
    public void setup() {
        themeList = new ThemeList();
    }

    @Test
    public void testGetThemesAsMap_NonNullThemes() {
        List<Theme> themes = new ArrayList<>();
        Theme theme1 = new Theme();
        theme1.setName("Theme1");
        themes.add(theme1);
        themeList.setThemes(themes);
        
        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertNotNull(themeMap);
        assertEquals(1, themeMap.size());
        assertTrue(themeMap.containsKey(theme1.getName()));
        assertEquals(theme1, themeMap.get(theme1.getName()));
    }

    @Test
    public void testGetThemesAsMap_EmptyThemes() {
        themeList.setThemes(new ArrayList<>());
        
        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertNotNull(themeMap);
        assertTrue(themeMap.isEmpty());
    }

    @Test
    public void testGetThemesAsMap_DuplicateThemes() {
        List<Theme> themes = new ArrayList<>();
        Theme theme1 = new Theme();
        theme1.setName("Theme1");
        themes.add(theme1);
        
        Theme theme2 = new Theme();
        theme2.setName("Theme1");
        themes.add(theme2);
        
        themeList.setThemes(themes);
        
        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertNotNull(themeMap);
        assertEquals(1, themeMap.size());
        assertTrue(themeMap.containsKey(theme2.getName()));
        assertEquals(theme2, themeMap.get(theme2.getName()));
    }

    @Test
    public void testGetThemesAsMap_NullThemes() {
        themeList.setThemes(null);

        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }

    @Test
    public void testGetThemesAsMap_NullThemeInThemes() {
        List<Theme> themes = new ArrayList<>();
        themes.add(null);
        themeList.setThemes(themes);

        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }

    @Test
    public void testGetThemesAsMap_NullThemeNameInThemes() {
        List<Theme> themes = new ArrayList<>();
        Theme theme = new Theme();
        themes.add(theme);
        themeList.setThemes(themes);

        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }
}
