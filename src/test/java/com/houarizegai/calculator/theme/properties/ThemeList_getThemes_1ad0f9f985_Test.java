// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

Here are some test scenarios that you can consider for testing the `getThemes` method of your class:

1. Scenario: Test if `getThemes` returns a non-null list when themes are set.
   - Given: A list of themes is set in the class.
   - When: `getThemes` is called.
   - Then: It should return a non-null list of themes.

2. Scenario: Test if `getThemes` returns an empty list when no themes are set.
   - Given: No themes are set in the class.
   - When: `getThemes` is called.
   - Then: It should return an empty list.

3. Scenario: Test if `getThemes` returns a list of correct size when themes are set.
   - Given: A list of themes with n elements is set in the class.
   - When: `getThemes` is called.
   - Then: It should return a list of size n.

4. Scenario: Test if `getThemes` returns a list with correct themes when themes are set.
   - Given: A list of specific themes is set in the class.
   - When: `getThemes` is called.
   - Then: It should return a list containing the same themes.

5. Scenario: Test if `getThemes` returns a list that does not reflect modifications to the original list of themes.
   - Given: A list of themes is set in the class.
   - When: `getThemes` is called and the returned list is modified.
   - Then: The original list of themes in the class should not be affected.

Note: As `getThemes` is a getter method, there isn't much business logic to be tested, but these scenarios can be helpful to ensure the method is functioning as expected.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThemeList_getThemes_1ad0f9f985_Test {

    private ThemeList themeList;
    private Theme theme1;
    private Theme theme2;

    @BeforeEach
    public void setUp() {
        themeList = new ThemeList();
        theme1 = new Theme();
        theme2 = new Theme();
    }

    @Test
    public void testGetThemes_WhenNoThemesSet() {
        assertTrue(themeList.getThemes().isEmpty());
    }

    @Test
    public void testGetThemes_WhenThemesAreSet() {
        List<Theme> themes = new ArrayList<>(Arrays.asList(theme1, theme2));
        themeList.setThemes(themes);

        List<Theme> result = themeList.getThemes();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(theme1));
        assertTrue(result.contains(theme2));
    }

    @Test
    public void testGetThemes_DoesNotReflectOriginalList() {
        List<Theme> themes = new ArrayList<>(Arrays.asList(theme1, theme2));
        themeList.setThemes(themes);

        List<Theme> result = themeList.getThemes();
        result.remove(theme1);

        assertTrue(themeList.getThemes().contains(theme1));
    }
}
