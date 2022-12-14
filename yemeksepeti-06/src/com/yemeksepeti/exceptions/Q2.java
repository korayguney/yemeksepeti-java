package com.yemeksepeti.exceptions;

public class Q2 {
    public static void main(String[] args) {
        new Q2().start();
    }

    public void start() {
        try {
            System.out.print("Starting up ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem ");
            System.exit(0);
        } finally {
            System.out.print("Shutting down ");
        }
    }
}

// A. Starting up
// B. Starting up Problem
// C. Starting up Problem Shutting down
// D. Starting up Shutting down
// E. An uncaught exception is thrown.