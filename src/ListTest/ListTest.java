/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author 3z
 */
public class ListTest {
    public static void main(String[] args){
        
        List<String> str = new ArrayList<String>();
        List<String> strLinked = new ArrayList<String>();
        
        str.add("CS105");
        str.add("CS107");
        str.add("CS104");
        str.add("CS106"); 
        
        strLinked.add("CS141");
        strLinked.add("CS111");
        strLinked.add("CS151");
        strLinked.add("CS121");
        strLinked.add("CS101");
        
        System.out.println("Str " + str);
        System.out.println("Str Sub list " + str.subList(0, 2));
        System.out.println("StrLinked " + strLinked);
        System.out.println("");
        
       /* System.out.println("StrLinked looped: ");
        for (int i = 0; i < strLinked.size(); i++) {
            System.out.println(strLinked.get(i));
        }*/
        
        Iterator<String> itList = str.iterator();
        Iterator<String> itLinked = strLinked.iterator();
        int i =0;
        while (itList.hasNext()) {
            String s = itList.next();
            System.out.println(s);
            if( i == 3) break;
        }
        ListIterator <String> itL = str.listIterator(str.size() -1);
        ListIterator <String> itLs = strLinked.listIterator(3);
        
        
    }
    

    
}
