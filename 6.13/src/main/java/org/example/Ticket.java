package org.example;

import java.util.Scanner;

public class Ticket {

    Scanner scanner = new Scanner(System.in);

    public void ticketSeller() {

        int ticketsLeft = 100;

        do {
            System.out.println("How many tickets would you like to buy?");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number between 1 and 4.");
                scanner.nextLine();
                continue;
            }
            int ticketSale = scanner.nextInt();
            if (ticketSale > 4 || ticketSale < 1){
                System.out.println("Sorry, I can only sell between 1 and 4 tickets.");
                continue;
            }
            ticketsLeft = ticketsLeft - ticketSale;
            System.out.println("There are " + ticketsLeft + " left.");

        } while (ticketsLeft > 0);

        }
    }
