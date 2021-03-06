package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.Homework_Lambda_Interfaces.ICreateExams;
import org.universityHierarchy.Homework_Lambda_Interfaces.ILambdaService;
import org.universityHierarchy.Homework_Lambda_Interfaces.IPrintExams;
import org.universityHierarchy.exceptions.ExamsNotCreatedExceptions;
import org.universityHierarchy.exceptions.PrintInformationException;
import org.universityHierarchy.service.ITeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherImpl extends TeacherInformation implements ITeacher {

    private static final Logger LOGGER = LogManager.getLogger(TeacherImpl.class);

    @Override
    public void addTeacherInformation() {

    }

    /**
     * this method calls an ILambdaService interface to print a message.
     * This also calls an ICreateExams lambda interface to create a new ArrayList of exams.
     *
     * @return a List of String into the exam variable.
     */
    @Override
    public ICreateExams examsCreated() {
        ILambdaService print = () -> LOGGER.info("Let' create an exams list: ");
        print.printSomething();
        try {
            ICreateExams crateExams = () -> {
                List<String> exams = new ArrayList<>();
                exams.add("Maths 1");
                exams.add("English Pronunciation");
                exams.add("History in West europe");
                exams.add("Argentina's Parliament");
                return exams;
            };
            return crateExams;
        } catch (ArrayStoreException ase) {
            LOGGER.debug(ase);
            throw new ExamsNotCreatedExceptions("The exams were not created");
        }
    }

    /**
     * This method calls an IPrintExams interface to print an ExamList, takes an
     * ICreateExams interface as parameter.
     *
     * @param examsLists takes the array of examList
     * @return a lambda function with stream method like sorted() and
     * collect(Collectors.toList())
     */
    @Override
    public IPrintExams printExams(ICreateExams examsLists) {
        try {
            IPrintExams showExams = (examsList) ->
                    LOGGER.info("Here are the exams created and sorted with streams: \n" +
                            examsLists.createExams()
                                    .stream()
                                    .sorted()
                                    .collect(Collectors.toList()));
            showExams.printExams(examsLists);
            LOGGER.info("\n");
            return showExams;
        } catch (Exception e) {
            throw new PrintInformationException("The exams could not be printed");
        }

    }
}