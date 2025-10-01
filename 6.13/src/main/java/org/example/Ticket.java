package org.example;

import java.util.Scanner;

public class Ticket {

    Scanner scanner = new Scanner(System.in);

    public void ticketSeller() {

        for (int ticketsLeft = 100; ticketsLeft >= 0; ticketsLeft--) {
            System.out.println("How many tickets would you like to buy?");
            int ticketSale = scanner.nextInt();
            ticketsLeft = ticketsLeft - ticketSale;
            System.out.println("There are " + ticketsLeft + " left.");

            do {
                if (ticketSale > 4 || ticketSale < 0) {
                    System.out.println("Sorry, we can only sell you between 1 and 4 tickets.");
                }
            }
        }
    }
}
