package com.financial;
import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather all inputs
        System.out.print("Enter deposit amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble() / 100; // Convert it to decimal

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // Apply the formula
        int totalDays = 365 * years;
        double dailyRate = annualRate / 365;
        double futureValue = principal * Math.pow(1 + dailyRate, totalDays);
        double interestEarned = futureValue - principal;

        // Display the results
        System.out.printf("Future Value: $%.2f\n", futureValue);
        System.out.printf("Interest Earned: $%.2f\n", interestEarned);

        // Close scanner
        input.close();
    }
}
