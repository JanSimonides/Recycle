package com.example.list;

public class Country {

    private String Name;
    private int Area;

    public Country(String name, int area) {
        Name = name;
        Area = area;
    }

    public Country(){
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }
}
