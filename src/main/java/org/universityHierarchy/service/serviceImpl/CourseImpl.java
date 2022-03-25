package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.*;
import org.universityHierarchy.service.ICourse;
import org.universityHierarchy.service.IStudent;
import org.universityHierarchy.service.ISubject;

import java.util.Scanner;

public class CourseImpl implements ISubject, ICourse {

    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);

    @Override
    public String[] addSubjectToCourse() {
        String[] subjects = new String[SUBJECTS_LENGTH];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < subjects.length; i++) {
                LOGGER.info("Enter the subjects, please. " + (i + 1));
                subjects[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.debug(e);
            throw new AddSubjectException("The subject could not be loaded");

        }
        return subjects;
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
    public void printSubjects(String[] subjects) {
        for (int i = 0; i < SUBJECTS_LENGTH; i++) {
            LOGGER.info(subjects[i] + " | ");
        }
    }

    @Override
    public void printWorkshop(String[] workshop) {
        for (int i = 0; i < workshop.length; i++) {
            LOGGER.info(workshop[i] + " | ");
        }
    }

    @Override
    public String[] addStudentToCourse() {
        String[] students = new String[4];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < students.length; i++) {
                LOGGER.info("Enter the students, please. " + (i + 1));
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
        for (int i = 0; i < students.length; i++) {
            LOGGER.info(students[i]);
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
            throw new AddTeachersToCourseException("The student could not be loaded" + e);
        }
        return teachers;
    }

    @Override
    public void printTeachers(String[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            LOGGER.info(teachers[i]);
        }
    }

}
