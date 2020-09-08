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
public class Factorial {

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6};
        for (int v : ints) {
            System.out.printf("%d! = %d\n", v, rfact(v));
        }
    }

    public static long rfact(long number) {

        // Start of base case
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 1;
        }// End of base case

        return rfact(number - 1) * number; // The execution of the recursive function. 

        /*  f(0) =  1 
            f(1) =  1 
            f(2) = 1! * 2 ==> 1 * 2 = 2
            f(3) = 2! * 3
            f(4) = 3! * 4 -IOW- 6 * 4 which is 24
            f(5) = 4! * 5 -IOW- 24 * 5 which is 120
            f(6) = 5! * 6 -IOW- 120 * 6 which is 720
         */
    }

}
