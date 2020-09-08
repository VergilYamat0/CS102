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
public interface Stackable <T>{
    public void push(T e);
    public void pop();
    public void print();
}
