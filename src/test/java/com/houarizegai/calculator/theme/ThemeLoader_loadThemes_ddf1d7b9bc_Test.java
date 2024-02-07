package com.houarizegai.calculator.theme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.houarizegai.calculator.theme.properties.Theme;
import com.houarizegai.calculator.theme.properties.ThemeList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ThemeLoader_loadThemes_ddf1d7b9bc_Test {

    @Mock
    private ObjectMapper mapper;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoadThemes_ValidFile() throws IOException {
        ThemeList themeList = new ThemeList();
        themeList.setThemes(Collections.singletonMap("theme1", new Theme()));
        when(mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class)).thenReturn(themeList);

        Map<String, Theme> themes = ThemeLoader.loadThemes();
        assertEquals(1, themes.size());
    }

    @Test
    public void testLoadThemes_FileNotFound() throws IOException {
        when(mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class)).thenThrow(new IOException());

        Map<String, Theme> themes = ThemeLoader.loadThemes();
        assertTrue(themes.isEmpty());
    }

    @Test
    public void testLoadThemes_EmptyFile() throws IOException {
        when(mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class)).thenReturn(new ThemeList());

        Map<String, Theme> themes = ThemeLoader.loadThemes();
        assertTrue(themes.isEmpty());
    }

    @Test
    public void testLoadThemes_InvalidData() throws IOException {
        when(mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class)).thenThrow(new IOException());

        Map<String, Theme> themes = ThemeLoader.loadThemes();
        assertTrue(themes.isEmpty());
    }

    @Test
    public void testLoadThemes_NoThemeData() throws IOException {
        ThemeList themeList = new ThemeList();
        themeList.setThemes(Collections.emptyMap());
        when(mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class)).thenReturn(themeList);

        Map<String, Theme> themes = ThemeLoader.loadThemes();
        assertTrue(themes.isEmpty());
    }
}
