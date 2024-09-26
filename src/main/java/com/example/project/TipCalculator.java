package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        DecimalFormat df = new DecimalFormat("#.##");
        double percentDecimal = (double) (percent) / 100; 
        double totalTip = (percentDecimal * cost);
        double totalBillWTip = ((cost) + (percentDecimal * cost));
        double costperPerson = ( cost / people);
        double tipPerPerson = ((percentDecimal * cost) / people);
        double totalCostAfterTipPer = (((cost) + (percentDecimal * cost)) / people);

            
        result.append("-------------------------------" + "\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n") ;
        result.append("Total tip: $" + df.format(totalTip) + "\n");
        result.append("Total Bill with tip: $" + df.format(totalBillWTip) + "\n");
        result.append("Per person cost before tip: $" + df.format(costperPerson) + "\n");
        result.append("Tip per person: $" + df.format(tipPerPerson) + "\n");
        result.append("Total cost per person: $" + df.format(totalCostAfterTipPer)+ "\n"); 
        result.append("-------------------------------\n");

        // I learned how to round from here: https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java/23207932 

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6 ; 
        int percent = 25; 
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}