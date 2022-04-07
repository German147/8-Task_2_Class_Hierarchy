package org.universityHierarchy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Student;

import java.util.function.Consumer;


public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String universityName = "Cordoba University";
    private static final String universityLocation = "South America";

    static Consumer<Student> greetCustomerFunction = student ->
            System.out.println("Hello " + student.getName() + " Thanks for registering" +
                    "your phone number " + student.getPhoneNumber());

    public static void main(String[] args) {

        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);
        //Here I initialize an object
        Student german = new Student();
        german.setName("German Garmendia");
        german.setPhoneNumber("456789123");
        //Here I inject the previous obtect to the function
        greetCustomerFunction.accept(german);


    }


}
