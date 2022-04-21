package org.universityHierarchy.Homework_Reflection_And_Threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.People;
import org.universityHierarchy.service.serviceImpl.CourseImpl;

import java.lang.reflect.*;

public class ReflectionImplementation {

    private static final Logger LOGGER = LogManager.getLogger(ReflectionImplementation.class);

    public static void main(String[] args) {

        getMethodOfClassCourseImpl();
        getFieldsOfClassPeole();
        getConstructorsOfClassCourseImpl();

    }

    /**
     * Here I get the fields of the class People
     */
    private static void getFieldsOfClassPeole() {
        try {
            Class people = People.class;

            LOGGER.info("Here I get the People field class with a for hence loop ");
            Field[] fields = people.getFields();
            for (Field field : fields) {
                LOGGER.info(Modifier.toString(field.getModifiers())
                        + " " + field.getType().getName() + " " + field.getName());
            }
        } catch (Throwable e) {
            LOGGER.debug(e);
        }
    }

    /**
     * Here I get all the methods of the class CourseImpl
     */
    public static void getMethodOfClassCourseImpl() {
        LOGGER.info("Here we get all the METHODS  of CourseImpl Class due to this class" +
                " has many methods");
        try {
            Class c = new CourseImpl().getClass();
            Method[] m = c.getDeclaredMethods();
            for (Method metodos : m) {
                LOGGER.info("Here The METHOD'S name is " + metodos.getName() + " and the return type is " + metodos.getReturnType());
            }
        } catch (Throwable e) {
            LOGGER.debug(e);
        }
    }

    /**
     * Here I get all the constructors of class CourseImpl
     */
    public static void getConstructorsOfClassCourseImpl() {
        try {
            Class people = People.class;
            Constructor[] constructorList = People.class.getDeclaredConstructors();
            LOGGER.info(" I get these constructors using a For hence loop");
            //for constructorList take one by one and put them into the constructor parameter
            for (Constructor constructors : constructorList) {
                LOGGER.info("This is a constructor " + constructors.getName());
                LOGGER.info("\n");
                LOGGER.info("Now here we print the Parameters of the constructors ");
                if (constructors.getParameterCount() == 1) {
                    LOGGER.info("No args constructor were found");
                } else {
                    Parameter[] parameter = constructors.getParameters();
                    for (Parameter params : parameter) {
                        LOGGER.info("Parameter's name: " + params.getName() + " : " + params.getType());
                    }
                }
            }
        } catch (Throwable e) {
            LOGGER.debug(e);
        }

    }
}
