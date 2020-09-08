
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3z
 */
public class TestL {

    public static void main(String[] args) {
        List<Integer> inte = new ArrayList<Integer>();
        List<String> str = new ArrayList<String>();

        inte.add(2);
        inte.add(1);
        inte.add(4);
        inte.add(6);

        str.add("KSU");
        str.add("PSU");
        str.add("WSU");
        str.add("QSU");

        Iterator<Integer> it = inte.iterator();
        Iterator<String> its = str.iterator();

        System.out.println("Iterator : ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");

        while (its.hasNext()) {
            System.out.print(its.next() + " ");
        }
        System.out.println("");

        ListIterator<String> ls = str.listIterator(4); // printing backward
        ListIterator<Integer> itLs = inte.listIterator();
        ListIterator<String> ls1 = str.listIterator();
        System.out.println("Listiterator: ");
        while (ls1.hasNext()) {
            System.out.println(ls1.next());
        }

        System.out.println("ListIterator backward: ");

        while (ls.hasPrevious()) { // printing backward
            System.out.println(ls.previous());
        }

        while (itLs.hasNext()) {
            System.out.println(itLs.next());
        }
    }

}
