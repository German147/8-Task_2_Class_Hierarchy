package org.universityHierarchy.exceptions;

public class StudentNotAddedToCourseException extends RuntimeException {
    public StudentNotAddedToCourseException(String message) {
        super(message);
    }
}
