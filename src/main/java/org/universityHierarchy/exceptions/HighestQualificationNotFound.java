package org.universityHierarchy.exceptions;

import java.io.IOException;

public class HighestQualificationNotFound extends RuntimeException {
    public HighestQualificationNotFound(String message) {
        super(message);
    }
}
