/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;

/**
 *
 * @author 3z
 */
public class Stack <T>{
    private ArrayList<T> elemnts = new ArrayList<T>();
    
    public Stack(ArrayList<T> elemnts){
        setElemnts(elemnts);
        
    }

   
    public void setElemnts(ArrayList<T> elemnts){
        this.elemnts = elemnts;
    }
    public ArrayList<T> getElemnts(){
        return elemnts;
    } 
    public void push(T e){
        elemnts.add(e);
        
        
    }
    public void pop(){
        if(elemnts.size() != 0){
            elemnts.remove(elemnts.size() - 1);
            
        }
    }
    
    public void print(){
        System.out.println("Stack");
        for(int i = elemnts.size() -1; i >= 0; i--){
            System.out.println(elemnts.get(i));
        }
    }
    
}
