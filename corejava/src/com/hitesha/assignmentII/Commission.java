package com.hitesha.assignmentII;

import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");
        name = scanner.nextLine();

        System.out.println("Enter Address:");
        address = scanner.nextLine();

        System.out.println("Enter Phone:");
        phone = scanner.nextLine();

        System.out.println("Enter Sales Amount:");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate the commission
    public void calculateCommission() {
        double commission = 0.0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0.0;
        }

        System.out.println("Commission for sales amount " + salesAmount + " is: " + commission);
    }

    public static void main(String[] args) {
        // Create an object of Commission class
        Commission commission = new Commission();

        // Call the member methods
        commission.acceptDetails();
        commission.calculateCommission();
    }
}
