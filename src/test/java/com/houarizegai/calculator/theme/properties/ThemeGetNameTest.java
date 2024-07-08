package com.houarizegai.calculator.theme.properties;
import com.fasterxml.jackson.dataformat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ThemeGetNameTest {
    @Test
    public void checkGetNameWhenNameIsSet() {
        // Arrange
        Theme themeInstance = new Theme();
        themeInstance.name = "John";
        // Act
        String expected = "John";
        String actual = themeInstance.getName();
        // Assert
        assertEquals(expected, actual, "Expected value doesn't match with actual value");
    }
    @Test
    public void checkGetNameWhenNameIsNull() {
        // Arrange
        Theme themeInstance = new Theme();
        // Act
        String actual = themeInstance.getName();
        // Assert
        assertNull(actual, "Expected null value but was not null");
    }
}