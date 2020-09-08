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
public class Product {
    
    private int ID;
    private String label;
    private double price;
    

    
  public Product (int id, String label, double price){
        setID(id);
        setLabel(label);
        setPrice (price);

    }
  

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", label=" + label + ", price=" + price + "}\n";
    }
 
}
