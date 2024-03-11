/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Chaithanya
 */
// DivisionOperation class
public class DivisionOperation implements BasicOperation {
    @Override
    public double add(double num1, double num2) {
        throw new UnsupportedOperationException("Addition operation is not supported in DivisionOperation.");
    }

    @Override
    public double subtract(double num1, double num2) {
        throw new UnsupportedOperationException("Subtraction operation is not supported in DivisionOperation.");
    }

    @Override
    public double multiply(double num1, double num2) {
        throw new UnsupportedOperationException("Multiplication operation is not supported in DivisionOperation.");
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}

