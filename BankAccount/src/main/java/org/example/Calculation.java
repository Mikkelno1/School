package org.example;

public class Calculation {

    /**
     * Class containing initial variables to perform the calculation
     */

    double initialBalance = 1000;
    double monthlyInterests = 0.005 + 1;



    public void annualInterest() {

        /**
         * Calculates the monthly balance based on the annual interest rate, which compounds monthly for 3 months
         */

        for (int i = 1; i <= 3; i++) {
            double sum = initialBalance * Math.pow((monthlyInterests), i);
            System.out.printf("Month %d: %.2f%n", i, sum);
        }
        }



    public static void main (String[] args) {

    }
}

//Set initial balance
//Set annual interest rate, converted to monthly rate
//For each month - total of 3
//  Calculate monthly interest and add to initial balance
//  Add monthly interest to new balance
//Print output with formatting
