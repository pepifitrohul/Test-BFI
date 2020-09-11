package com.enigma.testbfi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class exerciseEtest {

    @Test
    void exerciseEtest() {
        var m = new exerciseE();
        var tests = new HashMap<String, String>();

        tests.put("Tony Stark", "T**y S***k");
        tests.put("Peter Parker", "P***r P****r");
        tests.put("Bumblebee", "B*******e");
        tests.put("El Taurino", "El T*****o");
        tests.put("John Doe", "J**n D*e");
        tests.put("Crazy Rich Asian", "C***y R**h A***n");
        tests.put("Stephen Strange", "S*****n S*****e");
        tests.put("A Kid With Supernatural Abilities", "A K*d W**h S**********l A*******s");

        tests.forEach((original, masked) -> assertEquals(masked, m.solutionE(original)));
    }

}
