package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.AddStudentToCourseException;
import org.universityHierarchy.exceptions.AddTeachersToCourseException;
import org.universityHierarchy.exceptions.CreateWorkShopException;
import org.universityHierarchy.exceptions.SubjectNotAddedException;
import org.universityHierarchy.service.ICourse;
import org.universityHierarchy.service.ISubject;

import java.util.*;

public class CourseImpl implements ISubject, ICourse {

    private static String subjects[];
    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);


    @Override
    public String[] addSubjectToCourse() {
        String[] subjects = new String[SUBJECTS_LENGTH];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < SUBJECTS_LENGTH; i++) {
                LOGGER.info("Enter the subjects, please. " + (i + 1));
                subjects[i] = scanner.nextLine();
            }
            return subjects;
        } catch (RuntimeException e) {
            throw new SubjectNotAddedException("The subject was not added correctly");
        }
    }

    @Override
    public void printSubjects(String[] subjects) {
        Arrays.sort(subjects);
        for (int i = 0; i < SUBJECTS_LENGTH; i++) {
            LOGGER.info("The subjects added are " + subjects[i]);
        }
    }

    @Override
    public String[] createWorkshop() {
        String[] workshop = new String[WORKSHOP_LENGTH];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < WORKSHOP_LENGTH; i++) {
                LOGGER.info("Enter the new workshop, please");
                workshop[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.error(e);
            throw new CreateWorkShopException("The WorkShop could not be created");
        }
        return workshop;
    }


    @Override
    public void printWorkshop(String[] workshop) {
        for (String s : workshop) {
            LOGGER.info(s + " | ");
        }
    }

    @Override
    public String[] addStudentToCourse() {
        int studentAmount = 4;
        String[] students = new String[studentAmount];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < studentAmount; i++) {
                LOGGER.info("Enter 4 students, please. " + (i + 1));
                students[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new AddStudentToCourseException("The student could not be loaded" + e);
        }
        return students;
    }


    @Override
    public void printStudents(String[] students) {
        Arrays.sort(students);
        //Here I create a collection of String
        Collection<String> newStudents = new ArrayList<String>();
        newStudents.addAll(Arrays.asList(students));

        Iterator<String> i = newStudents.iterator();
        while (i.hasNext()) {
            LOGGER.info("This is one element of the collection of student: " + (i.next()));
        }
    }

    @Override
    public String[] addTeachers() {
        String[] teachers = new String[4];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < teachers.length; i++) {
                LOGGER.info("Enter the teachers, please. " + (i + 1));
                teachers[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new AddTeachersToCourseException("The Teachers could not be loaded" + e);
        }
        return teachers;
    }

    @Override
    public void printTeachers(String[] teachers) {
        for (String teacher : teachers) {
            LOGGER.info(teacher);
        }
    }

}
