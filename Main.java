package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(10);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        double centimeters = (30.48 * feet) + (2.54 * inches);
        if (feet >= 0 && inches >= 0 && inches <= 12){
            System.out.println("it will equal to " + centimeters + " cm");
            return centimeters;
        }
        else
            System.out.println("Invalid");
            return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {

        double feet = (inches / 12);
        double remainingInches = (inches % 12);

        if (inches >= 0) {
            System.out.println("it equals to " + feet);
            return feet;
        }
        else
            return -1;
    }



}
