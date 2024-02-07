// ********RoostGPT********
/*
Test generated by RoostGPT for test demoTestGitlab using AI Type Open AI and AI Model gpt-4

1. Test Scenario: Verify that the function `getNumbersBackground()` returns the correct and expected value of `numbersBackground`.
   Test Steps:
   - Set the value of `numbersBackground` to a known value.
   - Call `getNumbersBackground()`.
   - Check that the returned value matches the known value set earlier.

2. Test Scenario: Verify that the function `getNumbersBackground()` returns null if `numbersBackground` is not set.
   Test Steps:
   - Do not set a value for `numbersBackground`.
   - Call `getNumbersBackground()`.
   - Check that the returned value is null.

3. Test Scenario: Verify that the function `getNumbersBackground()` returns the last set value of `numbersBackground`.
   Test Steps:
   - Set the value of `numbersBackground` to a known value.
   - Set the value of `numbersBackground` to a different known value.
   - Call `getNumbersBackground()`.
   - Check that the returned value matches the last known value set.

4. Test Scenario: Verify that the function `getNumbersBackground()` returns the correct value of `numbersBackground` in a multithreaded environment.
   Test Steps:
   - Set the value of `numbersBackground` in one thread.
   - Call `getNumbersBackground()` in another thread.
   - Check that the returned value matches the value set in the first thread.

5. Test Scenario: Verify that the function `getNumbersBackground()` does not alter the value of `numbersBackground`.
   Test Steps:
   - Set the value of `numbersBackground` to a known value.
   - Call `getNumbersBackground()` multiple times.
   - Check that the value of `numbersBackground` remains the same before and after each call.
*/

// ********RoostGPT********
package com.houarizegai.calculator.theme.properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Theme_getNumbersBackground_3b93e7ca36_Test {

    private Theme theme;

    @BeforeEach
    public void setUp() {
        theme = new Theme();
    }

    @Test
    public void testGetNumbersBackgroundReturnsCorrectValue() {
        String expected = "123456";
        theme.setNumbersBackground(expected);
        String actual = theme.getNumbersBackground();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumbersBackgroundReturnsNullIfNotSet() {
        assertNull(theme.getNumbersBackground());
    }

    @Test
    public void testGetNumbersBackgroundReturnsLastSetValue() {
        String expected = "654321";
        theme.setNumbersBackground("123456");
        theme.setNumbersBackground(expected);
        String actual = theme.getNumbersBackground();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumbersBackgroundInMultithreadedEnvironment() throws InterruptedException {
        String expected = "123456";
        Thread thread1 = new Thread(() -> theme.setNumbersBackground(expected));
        Thread thread2 = new Thread(() -> {
            String actual = theme.getNumbersBackground();
            assertEquals(expected, actual);
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }

    @Test
    public void testGetNumbersBackgroundDoesNotAlterValue() {
        String expected = "123456";
        theme.setNumbersBackground(expected);
        String actual = theme.getNumbersBackground();
        assertEquals(expected, actual);
        actual = theme.getNumbersBackground();
        assertEquals(expected, actual);
    }
}
