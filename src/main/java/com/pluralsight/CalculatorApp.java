package com.pluralsight;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        // Initialize Scanner and output banking menu
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ramen Banking App");
        System.out.println("What calculator would you like to use?");
        System.out.println("\t(M)ortgage Calculator");
        System.out.println("\t(F)uture Value");
        System.out.println("\t(P)resent Value");
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
        System.out.println("What is the principal loan amount?");
        double principalAmount = input.nextDouble();
        System.out.println("What is the interest rate for the loan? (x.xxx%)");
        double interestRate = input.nextDouble() / 1200;
        System.out.println("What is the length of the loan? (in years)");
        int loanLength = input.nextInt() * 12;

        // Calculate monthly payment and total interest with formulas
        double monthPayment = (principalAmount * (interestRate * (Math.pow(1 + interestRate, loanLength)))) / ((Math.pow(1 + interestRate, loanLength))- 1);
        double totalInterest = (monthPayment * loanLength) - principalAmount;

        // Output results
        System.out.printf("A $%.2f loan at %.3f%% interest for %d years would have a $%.2f/mo payment with a total interest of $%.2f", principalAmount, interestRate * 1200, loanLength / 12, monthPayment, totalInterest);
    }
    public static void calculateFuture(Scanner input){
        System.out.println("What is the principal deposit amount?");
        float principalAmount = input.nextFloat();
        System.out.println("What is the interest rate for the CD? (x.xxx%");
        float interestRate = input.nextFloat();
        System.out.println("What is the length for the CD? (in years)");
        int depositLength = input.nextInt();



    }
    public static void calculatePresent(Scanner input){

    }
}
