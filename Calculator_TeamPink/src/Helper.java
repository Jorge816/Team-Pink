/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */


public class Helper {


    public static double monthlyPayment(double loanAmount, double annualInterestRate, int numberOfYears) {
    // Convert annual interest rate to a monthly rate
    double monthlyInterestRate = annualInterestRate / 12 / 100;
    // Total number of payments
    int numberOfMonths = numberOfYears * 12;

    // Monthly payment calculation using the correct formula
    double monthlyPayment = (loanAmount * monthlyInterestRate) / 
                        (1 - (1 / Math.pow((1 + monthlyInterestRate), numberOfMonths)));

    // Return the calculated monthly payment
    return monthlyPayment;
    }
    
}
