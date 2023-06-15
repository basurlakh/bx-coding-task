package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramSolutionTest {

    private final AnagramSolution solution = new AnagramSolution();

    @ParameterizedTest()
    @MethodSource("anagrams")
    void isAnagram(String first, String second, boolean expected) {
        assertEquals(expected, solution.isAnagram(first, second));
    }

    private static Stream<Arguments> anagrams() {
        return Stream.of(
                Arguments.of("cheater", "teacher", true),
                Arguments.of("cheater", "teach", false),
                Arguments.of("cheater", "cheater", false),
                Arguments.of("New York Times", "monkeys write", true),
                Arguments.of("She Sells Sanctuary", "Santa; shy, less cruel", true)
        );
    }
}