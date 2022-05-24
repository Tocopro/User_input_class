package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args)
    {
        // set new variables from the Distance_calc class

        Distance_Calc earth_distance = new Distance_Calc();
        float nai_la = earth_distance.City_1_latitude;
        float nai_lo = earth_distance.City_1_longitude;
        float ny_la = earth_distance.City_2_latitude;
        float ny_lo = earth_distance.City_2_longitude;

        // calculate the distance given the two points on the earths surface

        System.out.println("Calculating the Distance on the earths surface between Nairobi and New York ");
        float distance;
        distance = (float) (6371.01 * Math.acos(Math.sin(nai_la) * Math.sin(ny_lo) + Math.cos(nai_la)
                * Math.cos(ny_la)* Math.cos(nai_lo - ny_lo)));
        String distances_earth_surface = String.format("%.2f",distance);
        System.out.println( "Distance = " + distances_earth_surface + " KM");


    }
}
package com.company;

import java.util.Scanner;
public class Distance_Calc {
    float City_1_longitude = 0;
    float City_1_latitude = 0;
    float City_2_longitude = 0;
    float City_2_latitude = 0;

    public static void main(String[] args) {
        Scanner city_gps = new Scanner(System.in);
        System.out.println("Enter the City One Longitude: ");
        float City_1_longitude = city_gps.nextFloat();
        System.out.println("Enter the City One Latitude: ");
        float City_1_latitude = city_gps.nextFloat();
        System.out.println("Enter the City Two Longitude: ");
        float City_2_longitude = city_gps.nextFloat();
        System.out.println("Enter the City Two Latitude: ");
        float City_2_latitude = city_gps.nextFloat();
    }

    public float getCity_1_longitude() {
        return City_1_longitude;
    }

    public void setCity_1_longitude(float City_1_longitude) {
        this.City_1_longitude = City_1_longitude;
    }

    public float getCity_1_latitude() {
        return City_1_latitude;
    }

    public void setCity_1_latitude(float City_1_latitude) {
        this.City_1_latitude = City_1_latitude;
    }

    public float getCity_2_longitude() {
        return City_2_longitude;
    }

    public void setCity_2_longitude(float City_2_longitude) {
        this.City_2_longitude = City_2_longitude;
    }

    public float getCity_2_latitude() {
        return City_2_latitude;
    }

    public void setCity_2_latitude(float City_2_latitude) {
        this.City_2_latitude = City_2_latitude;
    }
}

