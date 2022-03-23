package org.universityHierarchy;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    private static final Logger LOGGER = LogManager.getLogger(AppTest.class);
    public static void main(String[] args) {
        LOGGER.debug("Hola changos");
    }
}


