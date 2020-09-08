/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternQuiz;

/**
 *
 * @author 3z
 */
public class ElectronicProduct extends Product {
    
    private String brand;
    
    public ElectronicProduct(int id, String label, 
            double price, String brand){
        super (id, label, price);
        setBrand(brand);
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public String getBrand(){
        return brand;
    }
    
} 
    
