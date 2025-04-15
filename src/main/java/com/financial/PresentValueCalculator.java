package com.financial;
import java.util.Scanner;

public class PresentValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter monthly payout amount: ");
        double monthlyPayout = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble() / 100; // Convert it to decimal

        System.out.print("Enter number of years for payout: ");
        int years = input.nextInt();

        // Calculate values needed
        double monthlyRate = annualRate / 12;
        int totalMonths = years * 12;

        // Apply present value formula
        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -totalMonths)) / monthlyRate;

        // Display the results
        System.out.printf("Present Value Needed: $%.2f\n", presentValue);

        // Close the scanner
        input.close();
    }
}
