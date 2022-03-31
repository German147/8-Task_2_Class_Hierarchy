package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Teacher;
import org.universityHierarchy.exceptions.*;
import org.universityHierarchy.service.ITeacher;

import java.util.*;

public class TeacherImpl extends TeacherInformation implements ITeacher {

    private static final Logger LOGGER = LogManager.getLogger(TeacherImpl.class);

    @Override
    public int gettingPositionTeacher() {
        LOGGER.info("Now let's state your teacher's category: ");
        LOGGER.info("If you have from 1 to 3 years working press 1");
        LOGGER.info("If you have from 4 to 8 years working press 2");
        LOGGER.info("If you have more than 9 years working press 3");
        try (Scanner scanner = new Scanner(System.in)) {
            int positionTeacher = scanner.nextInt();
            return positionTeacher;
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new CategoryTeacherNotSet("The teacher's category could not be set");
        }
    }

    @Override
    public String[] createClasses() {
        int classesAmount = 4;
        String[] classes = new String[classesAmount];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < classesAmount; i++) {
                LOGGER.info("Enter 4 classes, please. " + (i + 1));
                classes[i] = scanner.nextLine();
            }
            Arrays.sort(classes);
            return classes;
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new ClassesNotCreatedExcepcion("The classes could not be created");
        }
    }

    @Override
    public List createExams() {
        int examsAmount = 3;
        List exams = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                LOGGER.info("Enter three exams, please: ");
                exams.add(scanner.nextLine());
                examsAmount--;
            } while (examsAmount > 0);
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new ExamsNotCreatedExceptions("The exams were not created");
        }
        return exams;
    }

    @Override
    public void printExams(List examsLists) {
        LOGGER.info("The amount exams created is " + examsLists.size() + " The are the following: ");
        Iterator<String> it = examsLists.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next());
        }
    }

    @Override
    public LinkedList<String> createYearlyPlanningTopics() {
        LinkedList<String> planningLessons = new LinkedList<>();//declare your planningLessons
        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.info("Enter the number of topics and then the lessons topic itself : ");
            int nbr = scanner.nextInt();//read the number of element
            scanner.nextLine();
            do {
                planningLessons.add(scanner.nextLine());//read and insert into your list in one shot
                nbr--;//decrement the index
            } while (nbr > 0);//repeat until the index will be 0
        } catch (RuntimeException e) {
            throw new PlannigTopicsNotCreatedException("The topics were not created");
        }
        return planningLessons;
    }

    @Override
    public void printPlanningTopics(LinkedList<String> planningLessons) {
        Iterator<String> it = planningLessons.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next());
        }
    }


    @Override
    public void addTeacherInformation() {
        Teacher teacher1 = new Teacher();
        //I implement this try with resource in order to get ths scanner closed at the end of this execution
        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.info("Enter the following teacher's data: ");
            LOGGER.info("Enter the following student's data: ");
            LOGGER.info("Enter your name");
            String name = scanner.nextLine();
            teacher1.setName(name);
            LOGGER.info("Enter your surname");
            String surname = scanner.nextLine();
            teacher1.setSurname(surname);
            LOGGER.info("Enter your phone number");
            String phone = scanner.nextLine();
            teacher1.setPhoneNumber(phone);
            LOGGER.info("Enter your neighborhood");
            String neighborhood = scanner.nextLine();
            teacher1.setNeighborhoodName(neighborhood);
            LOGGER.info("Enter the state you live");
            String state = scanner.nextLine();
            teacher1.setStateName(state);
            LOGGER.info("Enter country name");
            String country = scanner.nextLine();
            teacher1.setCountryName(country);
            LOGGER.info("All teacher information was set");
        } catch (RuntimeException ex) {
            throw new StudentNotSetInformation("The student information was not set");
        }
    }
}