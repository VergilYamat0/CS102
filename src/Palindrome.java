/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3z
 */
public class Palindrome {
    public static void main(String[] args){
        String num = "696";
        if(num.charAt(0) == num.length() -1 ){
            System.out.println("it is a palindromes");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
