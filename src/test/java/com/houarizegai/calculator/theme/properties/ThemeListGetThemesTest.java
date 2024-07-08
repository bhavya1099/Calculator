package com.houarizegai.calculator.theme.properties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThemeListGetThemesTest {
    private ThemeList themeList;
    @BeforeEach
    public void setup() {
        themeList = new ThemeList();
    }
    @Test
    public void getThemesHasElements() {
        themeList.setThemes(Arrays.asList(new Theme("Theme1"), new Theme("Theme2")));
        List<Theme> actualThemesList = themeList.getThemes();
        assertNotNull(actualThemesList);
        assertNotEquals(0, actualThemesList.size());
    }
    @Test
    public void getThemesIsEmpty() {
        themeList.setThemes(Collections.emptyList());
        List<Theme> actualThemesList = themeList.getThemes();
        assertNotNull(actualThemesList);
        assertEquals(0, actualThemesList.size());
    }
    @Test
    public void getThemesHasUniqueElements() {
        List<Theme> expectedThemes = Arrays.asList(new Theme("Theme1"), new Theme("Theme2"));
        themeList.setThemes(expectedThemes);
        List<Theme> actualThemesList = themeList.getThemes();
        assertNotNull(actualThemesList);
        assertEquals(expectedThemes.size(), actualThemesList.size());
        for (Theme theme : expectedThemes) {
            assertEquals(1, Collections.frequency(actualThemesList, theme));
        }
    }
    @Test
    public void getThemesWhenListNotInitialized() {
        assertThrows(NullPointerException.class, () -> themeList.getThemes());
    }
}