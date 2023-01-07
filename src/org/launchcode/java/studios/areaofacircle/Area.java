package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Radius should be a number. Try again: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);

        System.out.println("The area is: " + area);

        input.close();


//        System.out.println("Enter the radius of the circle: ");
//        boolean isDouble = input.hasNextDouble();
//        if (isDouble){
//            double radius = input.nextDouble();
//            while (radius < 0)
//            if (radius>0){
//                double area = Circle.getArea(radius);
//                System.out.println("Area of circle is: " + area);
//            } else{
//                System.out.println("Please enter a positive decimal number");
//            }
//        } else {
//            System.out.println("Entered value is not a decimal number");
//        }


//        double pi = 3.14;
//        double area = pi * radius * radius;


    }
}

