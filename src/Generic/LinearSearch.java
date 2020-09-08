/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author 3z
 */
public class LinearSearch {

    public static <T extends Comparable<T>> int linearSearch(T[] list, T x) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(x) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {4,5,6,7};
        Double[] doubleArray = {3.2,1.2,6.1,3.4};
        
        System.out.println(linearSearch(intArray, 2));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 4));
        
    }
}
