package com.example.solidprinciples;

public class Circle implements Shape {
    private int radius;

    private Circle(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI* Math.pow(getRadius(),2);
    }
}
