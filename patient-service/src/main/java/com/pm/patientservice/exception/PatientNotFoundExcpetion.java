package com.pm.patientservice.exception;

public class PatientNotFoundExcpetion extends RuntimeException {
    public PatientNotFoundExcpetion(String message) {
        super(message);
    }
}
