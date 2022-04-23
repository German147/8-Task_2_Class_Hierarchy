package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.Homework_Lambda_Interfaces.ICreateSomething;
import org.universityHierarchy.Homework_Lambda_Interfaces.ILambdaService;
import org.universityHierarchy.exceptions.AddTeachersToCourseException;
import org.universityHierarchy.exceptions.PrintInformationException;
import org.universityHierarchy.exceptions.WorkShopNotCreatedException;
import org.universityHierarchy.service.ICourse;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseImpl implements ICourse {
    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);

    public CourseImpl() {
    }

    /**
     * This method takes an ILambdaService to print a message, then I use an
     * ICreateSomething  Generic lambda interface lo create a LinkedList of WorkShops offered
     *
     * @return a LinkedList of String sorted with stream()
     */
    @Override
    public ICreateSomething createWorkShop() {
        ILambdaService print = () -> LOGGER.info("Let' create a WorkShop list of the University: ");
        print.printSomething();
        try {
            ICreateSomething<List<String>> uniWorkShops = () -> {
                LinkedList<String> subjects = new LinkedList<>();
                subjects.add("The basement of this University");
                subjects.add("Accidents at University - How to Prosed");
                subjects.add("Introduction as a Freshman");
                subjects.add("New Inverted Lecture Style");
                List<String> orderedSubjects = subjects.stream().sorted().collect(Collectors.toList());
                return orderedSubjects;
            };
            return uniWorkShops;
        } catch (ArrayStoreException e) {
            LOGGER.debug(e);
            throw new WorkShopNotCreatedException("List of array not created");
        }
    }

    /**
     * This method prints a list of Workshops offered by the university.
     *
     * @param uniWorkShops with the list of workShops previously created.
     * @return a generic Lambda interface ICreateSomething<LinkedList<String>> with the
     * linkedList in it.
     */
    @Override
    public ICreateSomething<List<String>> printWorkshop(ICreateSomething<List<String>> uniWorkShops) {
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
        try {
            ICreateSomething<LinkedList<String>> teacherList = () -> {
                LinkedList<String> teacherLists = new LinkedList<>();
                teacherLists.add("Mr. Brown");
                teacherLists.add("Mss. Jones");
                teacherLists.add("Mr. Simpson");
                return teacherLists;
            };
            return teacherList;
        } catch (ArrayStoreException e) {
            LOGGER.debug(e);
            throw new AddTeachersToCourseException("The teacher list was not created");
        }
    }

    /**
     * This Method prints the list of teacher created previously.
     *
     * @param teacherList we have here the list created
     * @return a ICreateSomething generic interface with a list of teacher
     */
    @Override
    public ICreateSomething<LinkedList<String>> printTeachers(ICreateSomething<LinkedList<String>> teacherList) {
        try {
            teacherList.createSomething().stream().forEach((String) ->
                    LOGGER.info("One of the teacher is " + String + " ."));
            return teacherList;
        } catch (Exception e) {
            throw new PrintInformationException("The list of teacher cpuld not be printed");
        }

    }
}
