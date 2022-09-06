package com.example.solidprinciples;

import java.util.List;

public class AreaCalculator {
    private int sum(List<Shape> shapes){
       var sum = 0;

       for(int i=0;i<shapes.size();i++){
           Shape shape = shapes.get(i);
          sum+=shape.area();
       }
       return sum;
    }
}
