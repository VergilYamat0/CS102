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
public class ProductFactory {

   public IProduct getProduct(int id, String productType, String label, double price, String [] authors, String brand_isbn){
       //book 
       if(productType.equalsIgnoreCase("BookProduct")){
           BookProduct bp = new BookProduct(id, label, price, authors, brand_isbn);
           return bp;
       }

       else if(productType.equalsIgnoreCase("MobilePhoneProduct")){
           MobilePhoneProduct mpc = new MobilePhoneProduct(id, label, price, brand_isbn);
           return mpc;
       }
       else{
           return null;
       }
   }
   
}

           
