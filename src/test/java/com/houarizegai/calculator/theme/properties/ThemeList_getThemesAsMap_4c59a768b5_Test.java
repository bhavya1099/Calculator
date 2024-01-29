// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Test Scenario 1: Test with empty theme list
- Given that the themes list is empty, when getThemesAsMap() is called, then it should return an empty map.

Test Scenario 2: Test with non-empty theme list
- Given that the themes list is not empty, when getThemesAsMap() is called, then it should return a map with the same size as the themes list.

Test Scenario 3: Test with unique theme names
- Given that the themes list contains themes with unique names, when getThemesAsMap() is called, then it should return a map where each key is unique.

Test Scenario 4: Test with non-unique theme names
- Given that the themes list contains themes with non-unique names, when getThemesAsMap() is called, then an IllegalStateException should be thrown.

Test Scenario 5: Test the mapping of theme names to themes
- Given that the themes list contains themes, when getThemesAsMap() is called, then it should return a map where each key-value pair corresponds to a theme name and its corresponding theme object.

Test Scenario 6: Test with null theme name
- Given that the themes list contains a theme with a null name, when getThemesAsMap() is called, then a NullPointerException should be thrown. 

Test Scenario 7: Test with null themes list
- Given that the themes list is null, when getThemesAsMap() is called, then a NullPointerException should be thrown. 

Test Scenario 8: Test the immutability of the returned map
- Given that the themes list is not empty, when getThemesAsMap() is called and a theme is added to or removed from the returned map, then the original themes list should not be affected.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ThemeList_getThemesAsMap_4c59a768b5_Test {
    private List<Theme> themes;
    private ThemeList themeList;

    @BeforeEach
    public void setUp() {
        themes = new ArrayList<>();
        themeList = new ThemeList(themes);
    }

    @Test
    public void testGetThemesAsMapWithEmptyList() {
        Map<String, Theme> themeMap = themeList.getThemesAsMap();
        assertNotNull(themeMap);
        assertTrue(themeMap.isEmpty());
    }

    @Test
    public void testGetThemesAsMapWithNonEmptyList() {
        themes.add(new Theme("Theme1"));
        themes.add(new Theme("Theme2"));

        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertEquals(themes.size(), themeMap.size());
    }

    @Test
    public void testGetThemesAsMapWithUniqueThemeNames() {
        themes.add(new Theme("Theme1"));
        themes.add(new Theme("Theme2"));

        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertTrue(themeMap.containsKey("Theme1"));
        assertTrue(themeMap.containsKey("Theme2"));
    }

    @Test
    public void testGetThemesAsMapWithNonUniqueThemeNames() {
        themes.add(new Theme("Theme1"));
        themes.add(new Theme("Theme1"));

        assertThrows(IllegalStateException.class, () -> themeList.getThemesAsMap());
    }

    @Test
    public void testGetThemesAsMapMapping() {
        Theme theme1 = new Theme("Theme1");
        Theme theme2 = new Theme("Theme2");
        themes.add(theme1);
        themes.add(theme2);

        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        assertEquals(theme1, themeMap.get("Theme1"));
        assertEquals(theme2, themeMap.get("Theme2"));
    }

    @Test
    public void testGetThemesAsMapWithNullThemeName() {
        themes.add(new Theme(null));

        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }

    @Test
    public void testGetThemesAsMapWithNullList() {
        themeList = new ThemeList(null);

        assertThrows(NullPointerException.class, () -> themeList.getThemesAsMap());
    }

    @Test
    public void testGetThemesAsMapImmutability() {
        themes.add(new Theme("Theme1"));
        Map<String, Theme> themeMap = themeList.getThemesAsMap();

        themeMap.put("Theme2", new Theme("Theme2"));

        assertFalse(themeMap.size() == themes.size());
    }
}
