package com.yemeksepeti.exceptionchallenge;

public class NotEligibleForVotingException extends RuntimeException {
    public NotEligibleForVotingException(String message){
        super(message);
    }

    public NotEligibleForVotingException(String message, Throwable t){
        super(message, t);
    }
}
