/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.alannguyen.mathutil.core.test;

import static org.alannguyen.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author acer
 */
public class MathUtilityAdvancedTest {
    
    //Hàm chuẩn bị bộ data test để sau đó fill vào hàm assert ở dưới
    //assertE() ở dưới
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {3, 6}, 
                               {5, 120},
                               {4, 24}, 
                               {6, 720}};
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    @Test 
    public void testFactorialGivenWrongArgumentThrowsException() {
        Executable executable = () -> getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5)); //Lambda cho nhanh
    }
    
}
