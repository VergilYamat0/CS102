/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author 3z
 */
public class Exponential {

    public static long rfact(long number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 1;
        }
        return rfact(number - 1) * number;
    }
    /*  
    f(0) = x^0/0!
    f(1) = f0 + x^1/1!
    f(2) = f1 + x^2/2!
    ....
    f(n) = f(n - 1) + x^n/n!
     */
    public static double Expo(double x, int number) {
        // base case
        if (number == 0) {
            return 1;
        } else {
            return Expo(x, number - 1) + Math.pow(x, number) / rfact(number);
        }
    }
    public static void main(String[] args) {
        double x = 3.2;
        int n = 10;
        double appr = Expo(x, n);
        double exact = Math.exp(x);
        System.out.println("Approximate " + appr);
        System.out.println("Exact " + exact);
    }
}
