/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 154jo
 */
public class HelperTest {
    
    public HelperTest() {
    }

    /**
     * Test of isPositiveNumber method, of class Helper.
     */
    @Test
    public void testIsPositiveNumber() {
        System.out.println("isPositiveNumber - empty string");
        String num = "";
        boolean expResult = false;
        boolean result = Helper.isPositiveNumber(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsPositiveNumberValid() {
        System.out.println("isPositiveNumber - valid positive number");
        String num = "10";
        boolean expResult = true;
        boolean result = Helper.isPositiveNumber(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberZero() {
        System.out.println("isPositiveNumber - zero");
        String num = "0";
        boolean expResult = false;
        boolean result = Helper.isPositiveNumber(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberNegative() {
        System.out.println("isPositiveNumber - negative number");
        String num = "-5";
        boolean expResult = false;
        boolean result = Helper.isPositiveNumber(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsPositiveNumberNonNumeric() {
        System.out.println("isPositiveNumber - non-numeric string");
        String num = "abc";
        boolean expResult = false;
        boolean result = Helper.isPositiveNumber(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of inRange method, of class Helper.
     */
    @Test
    public void testInRangeWithinLimit() {
        System.out.println("inRange - number within range");
        double num = 500.0;
        double max = 1000.0;
        boolean expResult = true;
        boolean result = Helper.inRange(num, max);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testInRangeEqualToMax() {
        System.out.println("inRange - number equal to max");
        double num = 999999999.0;
        double max = 999999999.0;
        boolean expResult = true;
        boolean result = Helper.inRange(num, max);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRangeExceedsMax() {
        System.out.println("inRange - number exceeds max");
        double num = 1000000000.0;
        double max = 999999999.0;
        boolean expResult = false;
        boolean result = Helper.inRange(num, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcMonthlyPayment method, of class Helper.
     */
    @Test
    public void testCalcMonthlyPaymentAllZero() {
        System.out.println("calcMonthlyPayment - all inputs zero");
        double loanAmount = 0.0;
        double annualInterestRate = 0.0;
        int years = 0;
        double expResult = -1;  // Expected -1 due to input validation failure
        double result = Helper.calcMonthlyPayment(loanAmount, annualInterestRate, years);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testCalcMonthlyPaymentNegativeValues() {
        System.out.println("calcMonthlyPayment - negative values");
        double loanAmount = -5000.0;
        double annualInterestRate = -2.5;
        int years = -10;
        double expResult = -1;  // Expected -1 due to input validation failure
        double result = Helper.calcMonthlyPayment(loanAmount, annualInterestRate, years);
        assertEquals(expResult, result, 0.1);
    }
    
    @Test
    public void testCalcMonthlyPaymentValid() {
        System.out.println("calcMonthlyPayment - valid inputs");
        double loanAmount = 10000.0;
        double annualInterestRate = 5.0;
        int years = 2;
        double expResult = 438.71;
        double result = Helper.calcMonthlyPayment(loanAmount, annualInterestRate, years);
        assertEquals(expResult, result, 0.1);
    }

    
}
