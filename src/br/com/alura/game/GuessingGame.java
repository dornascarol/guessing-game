package br.com.alura.game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int generatedNumber = new Random().nextInt(50);
        int attempts = 0;
        int enteredNumber = 0;
        
        while (attempts < 5) {
            System.out.print("Enter a number between 0 and 50: ");
            enteredNumber = reader.nextInt();
            attempts++;
            
            if (enteredNumber == generatedNumber) {
                System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
                break;
            } else if (enteredNumber < generatedNumber) {
                System.out.println("The entered number is less than the generated number.");
            } else {
                System.out.println("The entered number is greater than the generated number.");
            }
        }

        if (attempts == 5 && enteredNumber != generatedNumber) {
             System.out.println("You failed to guess the number in 5 attempts. The number was: " + generatedNumber);
        }
    }

}
