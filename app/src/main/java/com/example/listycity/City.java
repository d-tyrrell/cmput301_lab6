package com.example.listycity;

/**  * This is a class that defines a City. */
public class City implements Comparable {
     private String city;
     private String province;
     City(String city, String province){
         this.city = city;
         this.province = province;
     }

    /** * This returns the string of the
     * * @param city *
     * This is a candidate city to add */
     String getCityName(){
         return this.city;
     }
     String getProvinceName(){
         return this.province;
     }

    /** * This method is so we can compare cities to each other
     * * @param city *
     * This is a candidate city to compare */
    @Override
    public int compareTo(Object o) {
         City city = (City) o;
         return this.city.compareTo(city.getCityName()); // this.city refers to the city name
         }

}
