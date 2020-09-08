/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 3z
 */
public class MapImpl<K, V> implements Map<K, V>{

    List<K> keys = new ArrayList<K>();
    List<V> values = new ArrayList<V>();

    @Override
    public void add(K key, V value) {
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            //replace the value in the values arraylist
            int keyIndex = keys.indexOf(key);
            values.remove(keyIndex);
            values.add(keyIndex, value);
        }

    }

    @Override
    public void pop(K key) {
        V value = null;
        if (keys.contains(key)) {
            int keyIndex = keys.indexOf(key);
            keys.remove(keyIndex);
            value = values.remove(keyIndex);
        }


    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean isEmpty() {
        return keys.isEmpty();
    }

    @Override
    public List<K> keys() {
        return keys;
    }

    @Override
    public void print() {
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + "\t" + values.get(i));
        }
    }
  
}
