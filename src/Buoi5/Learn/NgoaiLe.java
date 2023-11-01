package Buoi5.Learn;

import java.util.Arrays;
import java.util.Scanner;

class Circle{
    double radius;
    public void setRadius (double radius ) throws IllegalArgumentException {
        if(radius >=0){
            this.radius = radius;
            System.out.println("ok");
        }
        else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }
}

public class NgoaiLe {
    public static void main(String[] args) {
       Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        c.setRadius(r);
        System.out.println("End");
     /*  try {
           c.setRadius(r);
       }catch (Exception e){
           System.out.println(e.getMessage());
            e.printStackTrace();
       }*/

    }
}
