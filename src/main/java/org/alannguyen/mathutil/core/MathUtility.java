/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.alannguyen.mathutil.core;

/**
 *
 * @author acer
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    //Hàm tính n! = 1.2.3.4....n
    //Refractor => tối ưu code.
    //Thiết kế/quy ước cho hàm (method) này
    /**
     * 0! = 1! = 1;
     * Không áp dụng giai thừa cho số âm. Nếu n < 0 => chửi! => Ném ra exception
     * Không áp dụng giai thừa cho số lớn hơn 20. Vì 20! vừa đủ khít kiểu long!!! => 18 con số 0.
     * 21!, 22!,... : CHỬI, Ném ra exception.
     * @param n
     * @return 
     */
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20. Plzzz");
//        if (n == 0 || n == 1) return 1;
//        long product = 1; //Tích khởi đầu là 1, sau đó nhân dồn vào
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        return product;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n, n must be between 0..20, plz");
        return (n == 0 || n == 1)? 1 : n * getFactorial(n-1);
    }
}

//5! = 1.2.3.4.5 = 5.4! = 5.4.3! = 5.4.3.2! = ...