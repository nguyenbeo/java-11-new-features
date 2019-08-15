package se.mikka.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class OptionalTest {

    @Test
    public void testOptionalIsEmpty() {
        //Given
        Optional<String> emptyOptional = Optional.empty();

        //When and Then
        assertTrue(emptyOptional.isEmpty());
    }
}
