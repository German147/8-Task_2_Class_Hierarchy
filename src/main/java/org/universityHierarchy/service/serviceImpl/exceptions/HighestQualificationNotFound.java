package org.universityHierarchy.service.serviceImpl.exceptions;

public class HighestQualificationNotFound extends RuntimeException {
    public HighestQualificationNotFound(String message) {
        super(message);
    }
}
