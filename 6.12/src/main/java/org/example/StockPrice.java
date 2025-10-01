package org.example;

import java.util.Scanner;

public class StockPrice {

    Scanner scanner = new Scanner(System.in);

    public void stock() {

        do {
            System.out.println("Today's stock price is: ");
            double sharePrice = scanner.nextDouble();
            System.out.println("The price is " + sharePrice);

            if (sharePrice <= 75.5) {
                System.out.println("Stock price is not yet at the minimum price.");
            } else {
                System.out.println("The stock price has exceeded the minimum, sell.");
                break;
            }
        } while (true);
    }
}


/*
Your company has shares of stock it would
like to sell when their value exceeds a certain target price.
Write a program that reads the target price and then reads the current stock price
until it is at least the target price. Your program should use a Scanner to read a
sequence of double values from standard input.
Once the minimum is reached, the program should
report that the stock price exceeds the target price.
*/