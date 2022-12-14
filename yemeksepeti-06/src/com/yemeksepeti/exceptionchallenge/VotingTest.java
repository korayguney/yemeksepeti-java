package com.yemeksepeti.exceptionchallenge;

public class VotingTest {
    public static void main(String[] args) {

        try {
            getAge(18);
        } catch (NotEligibleForVotingException e) {
            e.printStackTrace();
        }
    }

    private static void getAge(int age) throws NotEligibleForVotingException {
        if (age < 18) {
            throw new NotEligibleForVotingException("Too young for voting. Current age: " + age);
        }
        System.out.println("Eligible to vote...");
    }

}
