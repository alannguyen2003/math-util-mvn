/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.alannguyen.mathutil.core.test;

import org.alannguyen.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author acer
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        long result = 1;
        for (int i = 2; i < 10; i++) {
            result *= i;
            assertEquals(result, MathUtility.getFactorial(i));
        }
    }
}
