package com.example.restfulApi.error;

public class LocalNotFound extends Exception{
    public LocalNotFound(String message) {
        super(message);
    }
}
