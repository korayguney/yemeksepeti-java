package com.yemeksepeti.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static final Random random = new Random();
    private static final int randomNumber = random.nextInt(10 + 1);
    static Scanner scanner = new Scanner(System.in);
    private static int guessCount;

    public static void main(String[] args) {
    guessTheNumber();
    }

    private static void guessTheNumber() {
        do{
            System.out.println(" Please guess a number");
            int guesssedNumber = scanner.nextInt();
            guessCount++;
          if(guesssedNumber == randomNumber) {
              System.out.println("You guessed the number correct in " + guessCount + " try !");
              break;
          }else {
              System.out.println("You could not guess the correct number in " + guessCount + " try !");
          }
        }while (guessCount<3);
        if (guessCount == 3) {
            System.out.println("Sorry, You could not guess the number. The expected number was " + randomNumber + ".");
        }
    }

}
