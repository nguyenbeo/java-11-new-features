package se.mikka.java11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JEP323LocalVariableInLambdaTest {

    /**
     * This feature is added to be able to use Annotation in lambda parameter
     */
    @Test
    public void testLocalVarInLambdaForJEP323() {
        //Given
        List<String> aList = Arrays.asList("String 1", "String 2", "String 3", "String 4");

        //When
        List<String> nonNullLowerCaseList = aList.stream().map((@MikkaAnnotation var s) -> s.toLowerCase()).collect(Collectors.toList());
    }
}

