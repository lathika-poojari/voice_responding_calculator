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
// VoiceRecognizer class with additional error handling
import java.util.Scanner;

public class VoiceRecognizer {
    private String voiceData;

    public void startListening() {
        System.out.println("Listening...");
        try (Scanner scanner = new Scanner(System.in)) {
            voiceData = scanner.nextLine(); // Capture voice data via console input
        } catch (Exception e) {
            System.out.println("Error occurred during voice recognition: " + e.getMessage());
        }
        System.out.println("Voice data captured: " + voiceData);
    }

    public void stopListening() {
        System.out.println("Voice recognition stopped.");
    }

    public String getVoiceData() {
        return voiceData;
    }
}

