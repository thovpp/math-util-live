/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author khuye
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: "+result);
        System.out.println("expected: 0! = 1; actual: "+MathUtil.getFactorial(0));
        
        System.out.println("expected: 1! = 1; actual: "+MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: "+MathUtil.getFactorial(3));
        // 
    }
    
}
