/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import calculator.AdditionOperation;
import calculator.BasicOperation;
import calculator.DivisionOperation;
import calculator.OperationFactory;
import calculator.ScientificCalculator;
import calculator.VoiceRecognizer;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Create a VoiceRecognizer instance
        VoiceRecognizer voiceRecognizer = new VoiceRecognizer();

        // Create a ScientificCalculator instance with VoiceRecognizer dependency injection
        ScientificCalculator calculator = new ScientificCalculator(voiceRecognizer);

        // Start listening
        calculator.startListening();

        
        
        // Example input data
        double num1 = 10;
        double num2 = 5;
        String operationType = "ADDITION"; // or "DIVISION"

        // Process input and perform operation
        double result = calculator.processInput(operationType, num1, num2);

        // Output the result
        System.out.println("Result: " + result);

        // Stop listening
        calculator.stopListening();
    }
}
