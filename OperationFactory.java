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
// Error Handling in OperationFactory class
public class OperationFactory {
    public BasicOperation createOperation(String operationType) {
        switch (operationType) {
            case "ADDITION":
                return new AdditionOperation();
            case "DIVISION":
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Invalid operation type: " + operationType);
        }
    }
}

