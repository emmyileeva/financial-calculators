package com.financial;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from user
        // Loan Amount
        System.out.print("Enter loan amount (principal): ");
        double principal = input.nextDouble();

        // Annual Interest Rate
        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble() / 100; // converting to decimal

        // Loan Term
        System.out.print("Enter loan term in years: ");
        int years = input.nextInt();

        // Calculate monthly interest and total number of payments
        int n = years * 12;
        double i = annualRate / 12;

        // Use formula to calculate monthly payment
        double monthlyPayment = principal * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);

        // Calculate total interest
        double totalPaid = monthlyPayment * n;
        double totalInterest = totalPaid - principal;

        // Output the results
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);

        input.close();
    }
}
