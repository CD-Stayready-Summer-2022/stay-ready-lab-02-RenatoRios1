package com.codedifferently.labs.lab23.partc.codingchallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {
    // Problem 06
    @Test
    public void dontAcceptTriplesTest01() {

        // Given
        int[] nums = {1, 1, 2, 2, 1};

        // When
        Boolean expected = true;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dontAcceptTriplesTest02() {

        // Given
        int[] nums = {1, 1, 2, 2, 2, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dontAcceptTriplesTest03() {

        // Given
        int[] nums = {1, 1, 1, 2, 2, 2, 1};

        // When
        Boolean expected = false;
        Boolean actual = Problem.dontAcceptTriples(nums);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
