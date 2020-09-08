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
public class FastFood extends Food {

    private String type;

    public FastFood(String name, double price, String type) {
        super(name, price);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == "Hot" || type == "hot" || type == "Fresh" || type == "fresh") {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Wrong type of food");
        }
    }
    /*a toString() method that prints the name of the FastFood and the string 
    “is a”+ type ,then, calls the toString () method of the superclass. */
    @Override
    public String toString(){
        return String.format("%s\n is a %s\n %s", getName(), type, super.toString());
    }
}
