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
public class PairTest {

    public static void main(String[] args) {
        Pair<Integer> pa = new Pair<Integer>(1, 2);

        Pair<Double> paa = new Pair<Double>(1.5, 2.3);
        
        Pair<String> pn = new Pair<String>("Jack", "PussyEater");
        
        System.out.println(pa);
        System.out.println(paa);
        System.out.println(pn);
    }
}
