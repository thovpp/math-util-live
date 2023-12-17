/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author khuye
 */
public class MathUtil {
    //n!  = 1.2.3.4.5.6...n
    //0! = 1! = 1
    //kh tinh giai thua cho so am
    //20! la vua khop kieu long, kieu long toi da 18 con so 0
    //21! vuot qua kieu long
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid Argument. n must be between 0 - 20");
            // ham dung ngay lap tuc
        
        if (n == 0 || n == 1) 
            return 1;
        // dung for hoac dequy - recursion
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
