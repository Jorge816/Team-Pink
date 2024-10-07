/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */


public class Helper {


    public static boolean isPositiveNumber(String num){
        try{
            double val = Double.parseDouble(num);
            return val > 0;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public static boolean inRange(double num, double max){
        return num <= max;
    }
    
    public static double calcMonthlyPayment(double loanAmount, double annualInterestRate, int years) {
        String msg = "";
        
        if(years <= 0){
            msg += "Input must be positive. Years must be greater than 0. \n";
        }
        
        if(annualInterestRate <= 0){
            msg += "Input must be positive. Annual interest rate must be greater than 0. \n";
        }
        
        if(loanAmount <= 0){
            msg += "Input must be positive. Loan Amount must be greater than 0. \n";
        }
        
        double maxValue = 999999999;
        if(!inRange(loanAmount, maxValue)){
            msg += "Input too large: Loan amount exceeds limit.";
        }
        
        if(!inRange(annualInterestRate, maxValue)){
            msg += "Input too large: Interest rate exceeds limit.";
        }
        
        if(!msg.isEmpty()){
            System.out.println(msg);
            return -1;
        }
        
        double monthlyInterestRate = annualInterestRate / 1200;
        int numMonths = years * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numMonths));
        
        return monthlyPayment;
    }
    
}
