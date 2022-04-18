package org.universityHierarchy.service.serviceImpl;

import Lambda_Interfaces.ICreateSomething;
import Lambda_Interfaces.ILambdaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ICourse;

import java.util.LinkedList;

public class CourseImpl implements ICourse {

    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);
    private static String[] subjects;

    /**
     * This method takes an ILambdaService to print a message, then I use an
     * ICreateSomething  Generic lambda interface lo create a LinkedList of WorkShops offered
     *
     * @return a LinkedList of String
     */
    @Override
    public ICreateSomething createWorkShop() {
        ILambdaService print = () -> LOGGER.info("Let' create a WorkShop list of the University: ");
        print.printSomething();

        ICreateSomething<LinkedList<String>> uniWorkShops = () -> {
            LinkedList<String> subjects = new LinkedList<>();
            subjects.add("Introduction as a Freshman");
            subjects.add("New Inverted Classes Style");
            subjects.add("The basement of this University");
            return subjects;
        };
        return uniWorkShops;
    }

    /**
     * This method prints a list of Workshops offered by the university.
     *
     * @param uniWorkShops with the list of workShops previously created.
     * @return a generic Lambda interface ICreateSomething<LinkedList<String>> with the
     * linkedList in it.
     */
    @Override
    public ICreateSomething<LinkedList<String>> printWorkshop(ICreateSomething<LinkedList<String>> uniWorkShops) {
        uniWorkShops.createSomething().stream().forEach((String) ->
                LOGGER.info("This is one of the workshops Offered by the University: " +
                        String + " ."));
        return uniWorkShops;
    }

    /**
     * This method takes an ILambdaService to print a message, then I use an
     * ICreateSomething  Generic lambda interface lo create a LinkedList of Teacher's surnames
     *
     * @return an ICreateSomething generic Interface with a likedList in it.
     */
    @Override
    public ICreateSomething<LinkedList<String>> createTeacherList() {

        ILambdaService print = () -> LOGGER.info("Now let's create a list of teacher using Generic Interface: ");
        print.printSomething();

        ICreateSomething<LinkedList<String>> teacherList = () -> {
            LinkedList<String> teacherLists = new LinkedList<>();
            teacherLists.add("Mr. Brown");
            teacherLists.add("Mss. Jones");
            teacherLists.add("Mr. Simpson");
            return teacherLists;
        };
        return teacherList;

    }

    /**
     * This Method prints the list of teacher created previously.
     *
     * @param teacherList we have here the list created
     * @return a ICreateSomething generic interface with a list of teacher
     */
    @Override
    public ICreateSomething<LinkedList<String>> printTeachers(ICreateSomething<LinkedList<String>> teacherList) {
        teacherList.createSomething().stream().forEach((String) ->
                LOGGER.info("One of the teacher is " + String + " ."));
        return teacherList;
    }


}
