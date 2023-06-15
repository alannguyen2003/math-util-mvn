/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.alannguyen.mathutil.main;

import org.alannguyen.mathutil.core.MathUtility;

/**
 *
 * @author acer
 */
//Class này clone lại 100% cái class java.util.Math của JDK
//Math.sqrt() Math.sin() Math.random()
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Test hàm getF() với các test case đã chuẩn bị
         * Test case #1, check getF() with n = 0, chi tiết xem ở dưới.!!
         */
        int n = 0;            //Check 0! có bằng 1 không.
        long expected = 1;
        long actual;          //Bằng mấy thì phải chạy hàm, sau đó so sánh.
        //Sau đó so sánh ổn ko, expected == actual ko
        //static chỉ dành cho trường hợp, không cần nhớ gì sau khi xử lí.
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + 
                                " | actual: " + actual);
        /** 
         * Test case 2:
         * Check getF() with n = 1
         */
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + 
                                " | actual: " + actual);
        /**
         * Test case 3:
         * Check getF() with n = 2,
         */
        n = 2;
        expected = 2;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + 
                                " | actual: " + actual);
        /** 
         * Test case #4
         * Check getF() with n = 4;
         */
        n = 4;
        expected = 24;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + 
                                " | actual: " + actual);
        /** 
         * Test case #5
         * Check getF() with n = 5;
         */
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! | expected: " + expected + 
                                " | actual: " + actual);
        /** 
         * Test case #6:
         * Check getF() with n = -1
         * Kì vọng trả về ngoại lệ
         */
        n = -1;
        expected = 120;
        
        System.out.println(n + "! | expected: " + "Exception vả vào mặt" + 
                                " | actual: ");
        MathUtility.getFactorial(n);
    }
    
}

//TEST CASE VÀ TEST DRIVEN DEVELOPMENT - TDD
/**
 * Việc viết code và test code được tiến hành song song, đan xen luôn
 * 1 hàm được viết ra thì ngay trong quá trình viết đã chuẩn bị luôn
 * bộ test cases, nhiều test case để test hàm đúng hay sai luôn
 * ta liên tục sửa code/thêm code và chạy test case, run test.
 * Giống QC là làm test case, run test case.
 * Khác QC: phải viết cả code cho app
 * Test case là 1 bộ data đưa vào hàm/app để test hàm/app đúng hay sai
 * chứa input, expected value, và cách thực thi test case luôn
 * đưa data, nhấn cái gì, xem cái gì, kết luận cái gì
 * 
 * Hàm getFactorial() có bộ data là: 0! -> 1, 1! -> 1, 2! -> 2, 3! -> 6, 4! -> 24, 5! -> 120, 
 * âm giai thừa, 21 giai thừa -> Chửi EXCEPTION
 * Nhiều bộ data, mỗi bộ ứng với 1 tình huống xài app/hàm, gọi test case
 * 
 * Các test case được viết theo quy tắc cơ bản như sau/format như sau: 
 * Test case #1: Check getF() with n = 0 
 * Steps/Procedures - Cách để test hàm/run test case.
 *          1. Given n = 0;
 *          2. Call getF(with n = 0)
 * Expected result - kì vọng gì, hy vọng gì khi thực thi cái Steps ở trên.
 *          Expected value: 1
 * Vietsub: Cho n = 0 vào hàm getF() và hi vọng hàm trả về con số 1.
 * 
 * Test case #2 Check getF() with n = 1 
 * Steps/Procedures - Cách để test hàm/run test case.
 *          1. Given n = 1;
 *          2. Call getF(with n = 1
 * Expected result - kì vọng gì, hy vọng gì khi thực thi cái Steps ở trên.
 *          Expected value: 1
 * Test case #n: Thay số vào thoi
 * 
 * Test driven development sẽ dựa trên:
 * 
 * Code bị sai gì đó khiến expected not bằng actual
 * => MẢU ĐỎ (SAI)
 * CODE ĐÚNG 
 * => MÀU XANH (ĐÚNG)
 * 
 * Chương trình thực hiện theo dạng ngăn xếp (Stack)!
 */