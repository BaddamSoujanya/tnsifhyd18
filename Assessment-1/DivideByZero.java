package com.coreconcepts.exceptionhandling;

public class DivideByZero {

	public static void main(String[] args) {
		        try {
		            int result = divide(10, 0);
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }

		    public static int divide(int dividend, int divisor) {
		        if (divisor == 0) {
		            throw new ArithmeticException("Cannot divide by zero!");
		        }
		        return dividend / divisor;
		    }



	}

