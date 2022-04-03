package service;

import java.util.LinkedList;
import java.util.List;

public interface ITeacher {

    int gettingPositionTeacher();

    String[] createClasses();

    List createExams();

    void printExams(List examsLists);

    LinkedList<String> createYearlyPlanningTopics();

    void printPlanningTopics(LinkedList<String> planningLessons);
}
