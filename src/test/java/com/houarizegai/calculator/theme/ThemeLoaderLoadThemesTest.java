package com.houarizegai.calculator.theme;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.houarizegai.calculator.theme.properties.Theme;
import com.houarizegai.calculator.theme.properties.ThemeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

public class ThemeLoaderLoadThemesTest {
    @Test
    void loadThemesWithValidYAML() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ThemeList themeList = null;
        try {
            themeList = mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(themeList.getThemesAsMap(), ThemeLoader.loadThemes());
    }
    @Test
    void loadThemesWithNonExistentYAML() {
        Assertions.assertEquals(Collections.emptyMap(), ThemeLoader.loadThemes());
    }
    @Test
    void loadThemesWithInvalidYAML() {
        try {
            new FileOutputStream("src/main/resources/application.yaml").write("{invalid: yaml}".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Collections.emptyMap(), ThemeLoader.loadThemes());
    }
    @Test
    void loadThemesWithEmptyYAML() {
        try {
            Files.write(Paths.get("src/main/resources/application.yaml"), "".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(Collections.emptyMap(), ThemeLoader.loadThemes());
    }
}