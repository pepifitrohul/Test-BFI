package com.enigma.testbfi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class exerciseFtest {
    @Test
    void exerciseFtest() {
        exerciseF exF = new exerciseF();
        var tests = new HashMap<String, Integer>();

        tests.put("sisayang",10);
        tests.put("pulxu pqnjzng",1);
        tests.put("zogjakarta",4);

        tests.forEach((problem, solution) -> {
            try {
                assertEquals(exF.solutionF(problem).size(), solution);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
