// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. **Scenario 1:** Check when the name is set properly.
   - **Test Case:** Set a valid name and retrieve it using the getName() method.
   - **Expected Result:** The name retrieved by getName() should be the same as the one set.

2. **Scenario 2:** Check when the name is not set.
   - **Test Case:** Do not set any name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return null or a default value depending on the implementation.

3. **Scenario 3:** Check when the name is set to an empty string.
   - **Test Case:** Set an empty string as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return an empty string.

4. **Scenario 4:** Check when the name is set to a string with spaces.
   - **Test Case:** Set a string with spaces (e.g., "  ") as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return the string with spaces.

5. **Scenario 5:** Check when the name is set to a string with special characters.
   - **Test Case:** Set a string with special characters (e.g., "@#$%") as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return the string with special characters.

6. **Scenario 6:** Check when the name is set to a long string.
   - **Test Case:** Set a long string (e.g., a string with 1000 characters) as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return the long string.

7. **Scenario 7:** Check when the name is set to a string with non-English characters.
   - **Test Case:** Set a string with non-English characters (e.g., "名前") as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return the string with non-English characters.

8. **Scenario 8:** Check when the name is set to a numeric string.
   - **Test Case:** Set a numeric string (e.g., "12345") as the name and retrieve it using the getName() method.
   - **Expected Result:** The getName() should return the numeric string.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Theme_getName_8400ac6fb7_Test {
    @Test
    public void testGetName_ValidName() {
        Theme theme = new Theme();
        theme.setName("TestTheme");
        assertEquals("TestTheme", theme.getName());
    }

    @Test
    public void testGetName_NoNameSet() {
        Theme theme = new Theme();
        assertNull(theme.getName());
    }

    @Test
    public void testGetName_EmptyStringName() {
        Theme theme = new Theme();
        theme.setName("");
        assertEquals("", theme.getName());
    }

    @Test
    public void testGetName_StringWithSpacesName() {
        Theme theme = new Theme();
        theme.setName("  ");
        assertEquals("  ", theme.getName());
    }

    @Test
    public void testGetName_StringWithSpecialCharactersName() {
        Theme theme = new Theme();
        theme.setName("@#$%");
        assertEquals("@#$%", theme.getName());
    }

    @Test
    public void testGetName_LongStringName() {
        Theme theme = new Theme();
        String longName = new String(new char[1000]).replace("\0", "a");
        theme.setName(longName);
        assertEquals(longName, theme.getName());
    }

    @Test
    public void testGetName_StringWithNonEnglishCharactersName() {
        Theme theme = new Theme();
        theme.setName("名前");
        assertEquals("名前", theme.getName());
    }

    @Test
    public void testGetName_NumericStringName() {
        Theme theme = new Theme();
        theme.setName("12345");
        assertEquals("12345", theme.getName());
    }
}
