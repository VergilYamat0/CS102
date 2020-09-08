/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.List;

/**
 *
 * @author 3z
 */
public interface Map<K,V> {
    public abstract void add(K key, V value);
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void pop(K key);
    public abstract List<K> keys();
    public abstract void print();
}
