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
public class Methods {

    public static<K> void printArray(K[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("");
  
    }

    public static <K extends Comparable<K>> K max(K x, K y, K z) {
        K max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 4, 6, 7, 9};
        Double[] doubleArray = {1.5, 4.33, 6.67, 9.7, 8.9};
        Character[] charArray = {'a', 'f', 'b'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        System.out.println(max(2, 5, 3));
        System.out.println(max(2.4, 5.7, 3.1));

        Student s1 = new Student("Mohamed", "Ali");
        Student s2 = new Student("Salah", "Mounir");
        Student s3 = new Student("Ahmed", "Samir");

        Student[] ST = {s1, s2, s3};

        printArray(ST);

        System.out.println(max(s1, s2, s3));

    }

}
