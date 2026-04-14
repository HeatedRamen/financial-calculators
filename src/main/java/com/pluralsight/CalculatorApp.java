package com.pluralsight;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        // Initialize Scanner and output banking menu
        Scanner input = new Scanner(System.in);
        println("Welcome to the Ramen Banking App");
        println("What calculator would you like to use?");
        println("\t(M)ortgage Calculator");
        println("\t(F)uture Value");
        println("\t(P)resent Value");
        String userChoice = input.next();

        // Switch cases based on which calculator user need
        switch (userChoice){
            case "M":
                calculateLoan(input);
                break;
            case "F":
                calculateFuture(input);
                break;
            case "P":
                calculatePresent(input);
                break;
            default:
                System.out.println("Please enter a valid value (M, F, P)");
        }
    }
    public static void calculateLoan(Scanner input){
        // Prompt user for loan information
        println("What is the principal loan amount?");
        double principalAmount = input.nextDouble();

        println("What is the interest rate for the loan? (x.xxx%)");
        double interestRate = input.nextDouble() / 1200;

        println("What is the length of the loan? (in years)");
        int loanLength = input.nextInt() * 12;

        // Calculate monthly payment and total interest with formulas
        double monthPayment = (principalAmount * (interestRate * (Math.pow(1 + interestRate, loanLength)))) / ((Math.pow(1 + interestRate, loanLength))- 1);
        double totalInterest = (monthPayment * loanLength) - principalAmount;
        System.out.printf("A $%.2f loan at %.3f%% interest for %d years would have a $%.2f/mo payment with a total interest of $%.2f", principalAmount, interestRate * 1200, loanLength / 12, monthPayment, totalInterest);
    }
    public static void calculateFuture(Scanner input){
        // Prompt user for deposit information
        println("What is the principal deposit amount?");
        double principalAmount = input.nextFloat();

        println("What is the interest rate for the CD? (x.xxx%");
        double interestRate = input.nextFloat() / 100;

        println("What is the length for the CD? (in years)");
        int depositLength = input.nextInt();

        // Calculate and output
        double totalValue = principalAmount * (Math.pow((1 + (interestRate / 365)), 365 * depositLength));
        double totalInterest = totalValue - principalAmount;
        System.out.printf("If you deposit $%.2f in a CD that earns %.3f%% interest and matures in %d year(s), your CD's ending balance will be $%.2f and you would have earned $%.2f in interest", principalAmount, interestRate * 100, depositLength, totalValue, totalInterest);
    }
    public static void calculatePresent(Scanner input){
        // Prompt user for annuity information
        println("What is your desired monthly payout?");
        double monthlyPay = input.nextDouble();

        println("What is the expected interest rate (x.xxx%)");
        double interestRate = input.nextDouble();

        println("How many years would you like to be paid out?");
        int payoutLength = input.nextInt();

        // Calculate Present Value
        double initialDeposit = ((monthlyPay * 12) * payoutLength);

        println("|| UNDER CONSTRUCTION ||");
    }
    public static void println(String message){
        System.out.println(message);
    }
}
