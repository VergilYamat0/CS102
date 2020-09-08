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
public class MobilePhoneProduct extends ElectronicProduct implements IProduct{
    
    public static final String [] brands = {"Samsung", "iPhone", "Huawei"};
    
    public MobilePhoneProduct(int id, String label, double price, String brand){
        super(id, label, price, brand);
        setBrand(brand);
    }
    
    @Override
    public void setBrand(String brand){
        for (String b : brands){
            if (brand.equals(b)){
                super.setBrand(brand);
                break;
            }      
        }
    }
    
    @Override
    public String toString(){
        return String.format("MobilePhoneProduct{%s}", super.toString());
    }

    @Override
    public String getPID() {
       return String.valueOf(this.getID());
    }

    @Override
    public String getInfo() {
        return toString();
    }
    
}
