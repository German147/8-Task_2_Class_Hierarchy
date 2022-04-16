package org.universityHierarchy.service;

import java.util.HashMap;

public interface INoticeBoard {

    void showExamNotice(HashMap<String, Integer> qualifications);

    void printQualifications(HashMap<String, Integer> qualification);

    void showDateExams();

    void showYearlyPlanningTopics();

}
