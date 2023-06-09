/*
 File: Mountain.java
 Description: Final project Mountain file 
 Created: Thurs. June 8th, 2023 
 Author: Jaime Rodriguez 
 Email: jaimer6435@student.vvc.edu
 */


 public class Mountain {


    private String name;
    private String country;
    private int elevation;

    public Mountain() {
        this.name = "";
        this.country = "";
        this.elevation = 0;
    }

    public Mountain(String name, String country, int elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getElevation() {
        return elevation;
    }

    public static double toMeters(double elevationInFeets) {

        final double FEET_TO_METER = 1 / 3.2808;
        return elevationInFeets * FEET_TO_METER;
    }

}