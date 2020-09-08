/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatternQuiz;

import Quiz2014.Address;
import previous.quiz01.fall2016.Street;

/**
 *
 * @author 3z
 */
public class OnlineStore {

    public static void main(String[] args) {

        Store store = Store.getInstance();
        ProductFactory pf = new ProductFactory();

        BookProduct[] books = new BookProduct[2];
        MobilePhoneProduct[] phones = new MobilePhoneProduct[2];


     
        String[] authors_book1 = {"Anis Koubaa"};
        String[] authors_book2 = {"Mohamed Affendi"};

        /*int id, String productType, String label, double price, String [] authors, String brand_isbn)*/
        books[0] = (BookProduct) pf.getProduct(1, "BookProduct", "Java Programming", 120.35, authors_book1, "1234569");
        books[1] = (BookProduct) pf.getProduct(2, "BookProduct", "Mobile Computing", 172.35, authors_book2, "5748789");

        //define phones
        
        phones[0] = (MobilePhoneProduct)pf.getProduct(1,"MobilePhoneProduct", "iPhone6", 3500.0, null, "iPhone");
        phones[1] = (MobilePhoneProduct)pf.getProduct(2, "MobilePhoneProduct", "Samsung S4", 2100.0, null,"Samsung");
        
        store.getProducts().add(books[0]);
        store.getProducts().add(books[1]);
        store.getProducts().add(phones[0]);
        store.getProducts().add(phones[1]);

        //define customer
        Street st1 = new Street(1, "Rafha Street", "Riyadh");
        Address a1 = new Address(st1, "Riyadh ", "Saud Arabia", 14523);

        Street st2 = new Street(12, "Olya Street", "Riyadh");
        Address a2 = new Address(st2, "Riyadh ", "Saud Arabia", 14523);

        Customer customer1 = new Customer("FG21", "Khaled Ali", a1);
        Customer customer2 = new Customer("FG25", "Hassan Mounir", a1);

        //define an order
        Order order1 = new Order(customer1, phones[0], customer1.getAddress());

        Address shippingAddress1 = a2;
        Order order2 = new Order(customer2, books[0], customer2.getAddress());

        System.out.println(order1);

        System.out.println(order2);

    }
}
