package com.pluralsight;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        // Initialize Scanner and prompt user for loan information
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ramen Banking App");
        System.out.println("What calculator would you like to use?");
        System.out.println("\t(M)ortgage Calculator");
        System.out.println("\t(F)uture Value");
        System.out.println("\t(P)resent Value");
        String userChoice = input.next();

        switch (userChoice){
            case "M":
                calculateLoan(input);
            case "F":
                calculateFuture(input);
            case "P":
                calculatePresent(input);
            default:
                System.out.println("Please enter a valid value (M, F, P)");
        }
    }
    public static void calculateLoan(Scanner input){

        System.out.println("What is the principal loan amount? ");
        float principalAmount = input.nextFloat();
        System.out.println("What is the interest rate for the loan? (x.xxx%) ");
        float interestRate = input.nextFloat() / 1200;
        System.out.println("What is the length of the loan? (in years) ");
        int loanLength = input.nextInt() * 12;

        double monthPayment = (principalAmount * (interestRate * (Math.pow(1 + interestRate, loanLength)))) / ((Math.pow(1 + interestRate, loanLength))- 1);
        double totalInterest = (monthPayment * loanLength) - principalAmount;
        System.out.printf("A $%.2f loan at %.3f%% interest for %d years would have a $%.2f/mo payment with a total interest of $%.2f", principalAmount, interestRate * 1200, loanLength / 12, monthPayment, totalInterest);
    }
    public static void calculateFuture(Scanner input){

    }
    public static void calculatePresent(Scanner input){

    }
}
