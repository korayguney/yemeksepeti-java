package com.yemeksepeti.exceptions;

public class FileIsNotFoundException extends RuntimeException {
    public FileIsNotFoundException() {
        super();
    }

    public FileIsNotFoundException(String message) {
        super(message);
    }


}
