package org.universityHierarchy.service.serviceImpl;

import Lambda_Interfaces.ICreateExams;
import Lambda_Interfaces.ILambdaService;
import Lambda_Interfaces.IPrintExams;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ITeacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
    public LinkedList<String> createYearlyPlanningTopics() {
        return null;
    }

    @Override
    public void printPlanningTopics(LinkedList<String> planningLessons) {

    }

    @Override
    public void addTeacherInformation() {

    }

    @Override
    public ICreateExams examsCreated() {
        ILambdaService examsNum = () -> LOGGER.info("Let' create an exams list: ");
        examsNum.printSomething();

        ICreateExams crateExams = () -> {
            List<String> exams = new ArrayList<>();
            exams.add("Maths 1");
            exams.add("English Pronunciation");
            exams.add("History in West europe");
            exams.add("Argentina's Parliament");
            return exams;
        };
        return crateExams;
    }

    @Override
    public IPrintExams printExams(ICreateExams examsLists) {
        IPrintExams showExams = (examsList) ->
                LOGGER.info("Here are the exams created and sorted with streams: \n" +
                        examsLists.createExams()
                                .stream()
                                .sorted()
                                .collect(Collectors.toList()));
        showExams.printExams(examsLists);
        LOGGER.info("\n");
        return showExams;
    }
}