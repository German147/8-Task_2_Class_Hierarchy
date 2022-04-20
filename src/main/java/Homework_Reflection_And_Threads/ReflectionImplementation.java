package Homework_Reflection_And_Threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.People;

import java.lang.reflect.Constructor;

public class ReflectionImplementation {

    private static final Logger LOGGER = LogManager.getLogger(ReflectionImplementation.class);

    public static void main(String[] args) {
        LOGGER.info("Here we get all the constructor of People Class");
//        try {
//            Class c = new CourseImpl().getClass();
//            Method[] m = c.getDeclaredMethods();
//            for (int i = 0; i < m.length; i++)
//                System.out.println(m[i].toString());
//        } catch (Throwable e) {
//            System.err.println(e);
//        }

        try {
            Class a = new People().getClass();
            Constructor[] ctorlist = People.class.getDeclaredConstructors();
            Object p = ctorlist[0].getParameterTypes();

            for (int i = 0; i < ctorlist.length; i++) {
                System.out.println(ctorlist[i].toString());
            }
            System.out.println("This is the parameter " + p);

        } catch (Throwable e) {
            System.err.println(e);
        }


    }

}
