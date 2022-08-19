package com.brian.crediback.service;

public class PersonaNotFoundException extends RuntimeException {
    public PersonaNotFoundException(String error) {
        super(error);
    }
}
