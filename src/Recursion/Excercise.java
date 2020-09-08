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
public class Excercise {

    public static double f(double x, int n) {
        /* base case 
        n = 1
         */
        if (n == 1) {
            return 1;
        }
        /* 
        General case 
        
        f(x, 2) = (x, 2-1) * x^2-1
        f(x, 3) = (x, 3-1) * x^3-1
        f(x, n) = (x, n-1) + n * x^n-1
        
         */
        return f(x, n - 1) + n * Math.pow(x, n - 1);
    }

    public static long rfact(long number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 1;
        }
        return rfact(number - 1) * number;
    }

    public static double cos(double x, int n) {
        if (n == 0) {
            return 1;
        }
        // general case
        // f(x, n) = f(x, n-1) + -1^n / (2 * n)! * x ^ 2 * n 
        return cos(x, n - 1) + ((Math.pow(-1, n) / rfact(2 * n))) * Math.pow(x, 2 * n);

    }

    public static double tan(double x, int n) {
        if (n == 1) {
            return x;
        } else  {
            return tan(x, n - 1) + (1 / (2 * n - 1)) * Math.pow(x, (2 * n - 1));
        }
    }
    public static double ff(double x, int n){
       if(Math.abs(x) >= 1){
        throw new IllegalArgumentException("abs(x) must be smaller than 1");
}        
if(n == 1) return x;
        return ff(x, n-1) + Math.pow(x, n) + (n-1) * Math.pow(x, n-1);
    }


    public static void main(String[] args) {
        int n = 10;
        double x = 0.5;
        System.out.println("Approximate: " + f(x, n));
        System.out.println("Exact: " + (1 / Math.pow(1 - x, 2)));
        System.out.println("________________________________________");
        double xc = 1.57;
        int nc = 5;
        double realValue = Math.cos(xc);
        double approximate = cos(xc, nc);
        System.out.println("real value " + realValue);
        System.out.println("approximate " + approximate);
        System.out.println("________________________________________");
        double xt = 1.2;
        int nt = 10;
        double realValuet = Math.tanh(xt);
        double approximatet = tan(xt, nt);
        System.out.println("Real value of tanh: " + realValuet);
        System.out.println("approximate: " + approximatet);
        System.out.println("________________________________________");
        System.out.println("ff : " +ff(0.5, 3));
        System.out.println("ff : " +ff(0.5, 10));
    }
}
