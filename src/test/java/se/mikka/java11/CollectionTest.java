package se.mikka.java11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {

    @Test
    public void testCollectionToArrays(){
        //Given
        List<MikkaTest> mikkaList = Arrays.asList(new MikkaTest());

        //When
        MikkaTest[] mikkaArray = mikkaList.toArray(MikkaTest[]::new);

        //Then
        assertEquals(1, mikkaArray.length);
    }

    class MikkaTest {

    }
}
