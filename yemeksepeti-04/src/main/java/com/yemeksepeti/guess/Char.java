package com.yemeksepeti.guess;

public class Char {

    static char letter = 'A';

    public static void main(String[] args) {
      doWithSwitch();
      doWithIfStatement();
    }

    private static void doWithIfStatement() {
        if (letter == 'A') {
            System.out.println("Letter is A");
        } else if (letter == 'B') {
            System.out.println("Letter is B");
        } else if (letter == 'C') {
            System.out.println("Letter is C");
        } else if (letter == 'D') {
            System.out.println("Letter is D");
        } else if (letter == 'E') {
            System.out.println("Letter is E");
        } else {
            System.out.println("Letter was not found!");
        }
    }

    public static void doWithSwitch(){
        switch (letter)
        {
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("Letter is D");
                break;
            case 'E':
                System.out.println("Letter is E");
                break;
            default:
                System.out.println("Letter was not found!");
        }
    }
}
