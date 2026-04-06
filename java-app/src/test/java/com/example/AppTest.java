// package com.example;

// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.Test;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest {

//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue() {
//         assertTrue(true);
//     }
// }

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeCheckerTest {
    @Test
    void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(4));
    }
}

