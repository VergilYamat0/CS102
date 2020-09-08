/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternQuiz;

import java.util.ArrayList;

/**
 *
 * @author 3z
 */ 
public class Store {
    
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    
    private static Store instance = null;
    
        
    private Store(){
        products = new ArrayList<Product>();
        orders = new ArrayList<Order>();
        
    }
    public static Store getInstance(){
        return instance;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
      
}
