package org.universityHierarchy.service;

import Lambda_Interfaces.ICreateExams;
import Lambda_Interfaces.IPrintExams;

import java.util.LinkedList;

public interface ITeacher {

    int gettingPositionTeacher();

    String[] createClasses();

    LinkedList<String> createYearlyPlanningTopics();

    void printPlanningTopics(LinkedList<String> planningLessons);

    ICreateExams examsCreated();

    IPrintExams printExams(ICreateExams examsLists);
}

