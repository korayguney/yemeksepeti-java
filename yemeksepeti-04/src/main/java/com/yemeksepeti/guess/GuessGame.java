package com.yemeksepeti.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int expectedNumber = random.nextInt(10 - 0 + 1) + 0;
        int guessCount = 0;


        do {
            System.out.println("Please guess a number between 1 and 10:");
            int guessedNumber = scanner.nextInt();
            guessCount++;

            if (guessedNumber == expectedNumber) {
                System.out.println("Bravo, You guessed the number correct!");
                break;
            } else {
                System.out.println("Ooops, You guessed the number incorrect. Please try again.");
            }
        } while (guessCount < 3);

        if (guessCount == 3) {
            System.out.println("Sorry, You could not guess the number. The expected number was " + expectedNumber + ".");
        }

    }

}
