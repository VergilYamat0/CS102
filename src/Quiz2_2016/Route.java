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
public class Route {

    private ArrayList<City> route = new ArrayList<City>();

    public Route(ArrayList<City> route) {
        setRoute(route);
    }

    public ArrayList<City> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<City> route) {
        this.route = route;
    }

    public void add(City c) {
        route.add(c);
    }

    public void remove(City c) {
        route.remove(c);
    }
    public Route(){
        
    }

    public double length() {
        double totalDistance = 0.0;
        for (int i = 0; i < route.size() - 1; i++) {
            City city1 = route.get(i);
            City city2 = route.get(i + 1);

            GPS location1 = city1.getLocation();
            GPS location2 = city2.getLocation();

            totalDistance = totalDistance + GPSDistanceCalculator.distance(route.get(i).getLocation(), route.get(i + 1).getLocation(), "K");

        }
        return totalDistance;

    }
}