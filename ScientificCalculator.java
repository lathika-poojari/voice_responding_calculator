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
// ScientificCalculator class with VoiceRecognizer dependency injection
public class ScientificCalculator {
    private final VoiceRecognizer voiceRecognizer;

    public ScientificCalculator(VoiceRecognizer voiceRecognizer) {
        this.voiceRecognizer = voiceRecognizer;
    }

    public void startListening() {
        voiceRecognizer.startListening();
    }

    public void stopListening() {
        voiceRecognizer.stopListening();
    }

    public double processInput(String operationType, double num1, double num2) {
        OperationFactory operationFactory = new OperationFactory();
        BasicOperation operation = operationFactory.createOperation(operationType);

        // Perform the operation
        return operation.add(num1, num2);
    }
}

