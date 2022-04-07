package service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.ITeacher;

import java.util.LinkedList;
import java.util.List;

public class TeacherImpl extends TeacherInformation implements ITeacher {

    private static final Logger LOGGER = LogManager.getLogger(TeacherImpl.class);

    @Override
    public int gettingPositionTeacher() {
        return 0;
    }

    @Override
    public String[] createClasses() {
        return new String[0];
    }

    @Override
    public List createExams() {
        return null;
    }

    @Override
    public void printExams(List examsLists) {

    }

    @Override
    public LinkedList<String> createYearlyPlanningTopics() {
        return null;
    }

    @Override
    public void printPlanningTopics(LinkedList<String> planningLessons) {

    }

    @Override
    public void addTeacherInformation() {

    }

}