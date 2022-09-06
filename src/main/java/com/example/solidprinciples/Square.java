package com.example.solidprinciples;

public class Square {
    private int length;

    private Square(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
}
