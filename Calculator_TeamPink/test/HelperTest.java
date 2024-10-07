/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedro
 */
public class HelperTest {
    
    public HelperTest() {
    }


    /**
     * Test of MontlyPayment method, of class Helper.
     */
    @Test
    public void testMonthlyPayment() {
        System.out.println("monthlyPayment");

        // Test inputs
        double loanAmount = 10000.0; // $10,000 loan
        double annualInterestRate = 5.0; // 5% annual interest rate
        int numberOfYears = 2; // 2-year loan duration

        // Expected result (use a calculator or manual calculation to get this)
        double expResult = 438.71; // Assuming monthly payment is $438.71

        // Actual result from the method
        double result = Helper.monthlyPayment(loanAmount, annualInterestRate, numberOfYears);

        // Assertion to check if the result matches the expected value
        assertEquals(expResult, result, 0.01); // Allowing a small margin of error (0.01)

        // If everything is correct, no need to fail the test
        // fail("The test case is a prototype."); // Remove or comment out this line
    }

    /**
     * Test of MontlyPayment method, of class Helper.
     */
    @Test
    public void testMonthlyPayment2() {
        System.out.println("monthlyPayment");

        // Test inputs
        double loanAmount = 200000.0; // $10,000 loan
        double annualInterestRate = 6.0; // 5% annual interest rate
        int numberOfYears = 15; // 2-year loan duration

        // Expected result (use a calculator or manual calculation to get this)
        double expResult = 1687.71; // Assuming monthly payment is $438.71

        // Actual result from the method
        double result = Helper.monthlyPayment(loanAmount, annualInterestRate, numberOfYears);

        // Assertion to check if the result matches the expected value
        assertEquals(expResult, result, 0.01); // Allowing a small margin of error (0.01)

        // If everything is correct, no need to fail the test
        // fail("The test case is a prototype."); // Remove or comment out this line
    }

    
}
