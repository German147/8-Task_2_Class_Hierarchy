package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.exceptions.*;
import org.universityHierarchy.service.ICourse;
import org.universityHierarchy.service.ISubject;

import java.util.*;

public class CourseImpl implements ISubject, ICourse {

    private static String subjects[];
    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);
    public Scanner scanner = new Scanner(System.in);

    @Override
    public Set<String> createSubjects(){
        Set<String> subjects = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.info("Enter the number of subjects and then the subject itself : ");
            int nbr = scanner.nextInt();//read the number of element
            scanner.nextLine();
            do {
                subjects.add(scanner.nextLine());//read and insert into your list in one shot
                nbr--;//decrement the index
            } while (nbr > 0);//repeat until the index will be 0
        } catch (RuntimeException e) {
            throw new SubjectsNotCreatedEsception("The subjects were not created");
        }
        return subjects;
    }
    @Override
    public void printSubjects(Set<String> subjects){
        Iterator<String> it = subjects.iterator();
        while (it.hasNext()){
            LOGGER.info(it.next());
        }
    }

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

    // TODO: 26/3/2022  
    @Override
    public String[] createWorkshop() {
       int workshopAmount = 3;
        String[] workshops = new String[workshopAmount];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < workshopAmount; i++) {
                LOGGER.info("Enter the new workshop, please" + (i+1));
                workshops[i] = scanner.nextLine();
            }
        } catch (RuntimeException e) {
            LOGGER.error(e);
            throw new WorkShopNotCreatedException("The WorkShop could not be created");
        }
        return workshops;
    }

    @Override
    public void printWorkshop(String[] workshops) {
        Arrays.sort(workshops);
        //Here I create a collection of String
        Collection<String> newWorkshops = new ArrayList<String>();
        newWorkshops.addAll(Arrays.asList(createWorkshop()));
        Iterator<String> i = newWorkshops.iterator();
        while (i.hasNext()) {
            LOGGER.info("This is an element of the collection of workshops " + (i.next()));
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
            throw new StudentNotAddedToCourseException("The student could not be loaded" + e);
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
