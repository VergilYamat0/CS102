/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_2016;

import java.util.ArrayList;

/**
 *
 * @author 3z
 */
public class RouteTest {

    public static void main(String[] args) {
        City Riyadh = new City("Riyadh", new GPS(24.7136, 46.6735, 1.0),"Saudi Arabia");
        City Jeddah = new City("Jeddah", new GPS(21.2854, 39.2376, 1.0),"Saudi Arabia");
        City Madinah = new City("Madinah", new GPS(24.5247, 39.5692, 1.0),"Saudi Arabia");
        City Makkah = new City("Makkah", new GPS(21.3891,39.8579, 1.0),"Saudi Arabia");
        
        Route route = new Route();
        
        route.add(Riyadh);
        route.add(Jeddah);
        route.add(Madinah);
        route.add(Makkah);
        
        System.out.println("The length: " + route.length());
        
        
        
    }
}
