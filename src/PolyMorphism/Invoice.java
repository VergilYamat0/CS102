/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyMorphism;

/**
 *
 * @author 3z
 */
public abstract class Invoice implements Payable{

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String part, String description, int count,
            double price) {
        partNumber = part;
        partDescription = description;

        if (count > 0) {
            quantity = count;
        }
        if (price > 0.0) {
            pricePerItem = price;
        }
    }

    public void setPartNumber(String part) {
        partNumber = part;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String description) {
        partDescription = description;
    }

    // get part description
    public String getPartDescription() {
        return partDescription;
    }

    // set quantity
    public void setQuantity(int count) {
        if (count > 0) {
            quantity = count;
        }
        if (count <= 0) {
            quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    // set price per item
    public void setPricePerItem(double price) {
        if (price > 0.0) {
            pricePerItem = price;
        }
        if (price <= 0.0) {
            pricePerItem = 0.0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double totalPrice() {
        return this.getQuantity() * this.getPricePerItem();
    }
    @Override
    public String toString() {
        return String.format("(%s %.2f)", this.partDescription,
                this.pricePerItem);
    }

    public double getPayment() {
        return this.getQuantity() * this.getPricePerItem();
    }
 
   

}
