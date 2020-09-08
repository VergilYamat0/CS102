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
public class Pizza extends FastFood {

    private String[] toppings = new String[5];
    private boolean isSpicy;

    public Pizza(String[] toppings, boolean isSpicy, String name, double price, String type) {
        super(name, price, type);
        setToppings(toppings);
        setType("Hot");
    }

    public boolean isIsSpicy() {
        return isSpicy;
    }
   
/*specifies whether the sauce is spicy (value 1) or not (value 0). */
    public void setIsSpicy(boolean isSpicy) {
       int value = 0;
        if(getType() == "Hot"){
            value++;
        }
        else
            System.out.println(value);
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
    /* a toString() method that calls the toString() method of 
    the class FastFood, in addition to the String “. It is a Pizza” */
    @Override
    public String toString(){
        return String.format("%s it's a pizza", super.toString());
    }
}
