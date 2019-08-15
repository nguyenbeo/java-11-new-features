package se.mikka.java11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringMethodsTest {

    @Test
    public void testNewStringMethods() {
        //Given
        String testString = "nguyen\nbinh\nnguyen";

        //When and Then

        //isBlank() method
        assertFalse(testString.isBlank());

        //lines() method
        long numberOfLines = testString.lines().count();
        assertEquals(3, numberOfLines);

        //repeat() method
        assertEquals("==", "=".repeat(2));

        //stripLeading()
        assertEquals("Nguyen ", " Nguyen ".stripLeading());

        //stripTrailing()
        assertEquals(" Nguyen", " Nguyen ".stripTrailing());
    }
}
