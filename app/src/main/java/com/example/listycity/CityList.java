package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**  * This is a class that keeps a list of city objects */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /** * This adds a city to the list if the city does not exist
     * * @param city *
     * This is a candidate city to add */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }   cities.add(city);
    }

    /** * This returns a sorted list of cities
     * * @return *
     * Return the sorted list */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /** * This returns true if the given city is inside the list, false otherwise
     * * @param city *
     *
     * This is a candidate city to test
     *  * * @return *
     *      * Return true if city is in the list, false otherwise */

    public boolean hasCity(City city) {
        if (cities.contains(city)){
            return true;
        }
        else{
            return false;
        }
    }


    /** * This deletes a city to the list if the city is in the list
     * * @param city *
     * This is a candidate city to delete */
    public void deleteCity(City city) {
        if (hasCity(city)){
            cities.remove(city);
        }
        else throw new IllegalArgumentException();
    }

    /** * This returns the size of the cities list */
    public int countCities() {
        if (cities.isEmpty()) {
            throw new IllegalArgumentException();
        } return cities.size();
    }

}
