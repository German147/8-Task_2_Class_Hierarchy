package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ICourse;
import org.universityHierarchy.service.ISubject;

import java.util.*;

public class CourseImpl implements ISubject, ICourse {

    private static final Logger LOGGER = LogManager.getLogger(CourseImpl.class);
    private static String[] subjects;

    @Override
    public LinkedList<String> createTeacherList() {
        LinkedList<String> teacherList = new LinkedList<>();
        teacherList.add("Maths");
        teacherList.add("Biology");
        teacherList.add("History");
        return teacherList;
    }

    @Override
    public void printSubjects(Set<String> subjects) {
        Iterator<String> it = subjects.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next());
        }
    }

    @Override
    public LinkedList<String> createWorkshop() {
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("Maths");
        subjects.add("Biology");
        subjects.add("History");
        return subjects;
    }

    @Override
    public void printWorkshop(LinkedList<String> workshop) {
        Iterator<String> it = workshop.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next());
        }
    }

    @Override
    public String[] addStudentToCourse() {
        String[] addStudenttoCourse = {"Juan", "Manuel",
                "De Rosas", "Jose", "Manuel"};
        return addStudenttoCourse;
    }

    @Override
    public void printStudents(String[] addStudenttoCourse) {
        Arrays.sort(addStudenttoCourse);
        //Here I create a collection of String
        Collection<String> newStudents = new ArrayList<String>();
        newStudents.addAll(Arrays.asList(addStudenttoCourse));

        Iterator<String> i = newStudents.iterator();
        while (i.hasNext()) {
            LOGGER.info("This is one element of the collection of student: " + (i.next()));
        }
    }

    @Override
    public void printTeachers(LinkedList<String> teacherList) {
        Iterator<String> it = teacherList.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next());
        }
    }
}
