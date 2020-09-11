package com.enigma.testbfi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class exerciseDtest {
    @Test
    void exerciseDtest() {
        exerciseD exD = new exerciseD();
        var tests = new HashMap<Integer[], Integer>();

        tests.put(new Integer[] { 3, 2, -5, 0 }, -1);
        tests.put(new Integer[] { 10, -1, -2, -3 }, -4);
        tests.put(new Integer[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
        tests.put(new Integer[] { 0, 2, 4, -1, -3, -4 }, -2);
        tests.put(new Integer[] { 3, 2, -5, -1, -2, 0 }, -3);

        tests.forEach((problem, solution) -> assertTrue(exD.solutionD(problem) == solution));

    }

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        exerciseD exD = new exerciseD();
        System.out.println(exerciseD.solutionD(new Integer[] { 3, 2, -5, 0 }));

        Assert.assertEquals(exD.solutionD(new Integer[] { 3, 2, -5, 0 }), -1);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
