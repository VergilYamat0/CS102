/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InhertianceQuizPractice;

/**
 *
 * @author 3z
 */
public class Food {
    private String name;
    private double price;
    
    public Food(String name, double price){
        setName(name);
        setPrice(price);
    }
    public Food(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0.0){
            this.price = price;
        }
        else
            throw new IllegalArgumentException("Wrong price! ");
    }
    @Override
    public String toString(){
        return String.format("is a Food");
    }
}
