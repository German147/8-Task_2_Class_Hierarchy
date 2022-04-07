package org.universityHierarchy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String universityName = "Cordoba University";
    private static final String universityLocation = "South America";

    public static void main(String[] args) {

        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);

    }


}
