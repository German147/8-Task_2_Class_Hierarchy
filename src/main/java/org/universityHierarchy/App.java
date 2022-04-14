package org.universityHierarchy;


import Lambda_Interfaces.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String universityName = " Cordoba University ";
    private static final String universityLocation = " South America ";

    static Consumer<Student> greetCustomerFunction = student ->
            System.out.println(" Hello " + student.getName() + " your Id is: "
                    + student.getStudent_id() + " Thanks for registering " +
                    " your phone number " + student.getPhoneNumber());

    public static void main(String[] args) {

        System.out.println(universityName);
        System.out.println("This is located in " + universityLocation);
        //Here I initialize an object
        Student german = new Student();
        german.setName("German Garmendia");
        german.setPhoneNumber("456789123");
        german.setStudent_id(007);
        //Here I inject the previous object to the function
        greetCustomerFunction.accept(german);


        ILambdaService examsNum = () -> LOGGER.info("Let' create and see an exams list: ");
        examsNum.printSomething();
        ICreateExams crateExams = () -> {
            List<String> exams = new ArrayList<>();
            exams.add("Maths 1");
            exams.add("English Pronunciation");
            exams.add("History in West europe");
            exams.add("Argentina's Parliament");
            return exams;
        };
        IPrintExams showExams = (ICreateExams letsCreateExam) ->
                LOGGER.info("Here are the exams created and sorted with streams: \n" +
                        letsCreateExam.createExams()
                                .stream()
                                .sorted()
                                .collect(Collectors.toList()));
        showExams.printExams(crateExams);
        LOGGER.info("\n");

        IPrintExams showMinimumExam = (ICreateExams letsCreateExam) ->
                LOGGER.info("Now here we use the Min comparator of stream to get the minimum exam \n" +
                        letsCreateExam.createExams().stream().min(String::compareTo).get());
        showMinimumExam.printExams(crateExams);


        IAddSubject addSubjects = () -> {
            LOGGER.info("Now let's create some subjects: ");
            LinkedList<String> subjects = new LinkedList<>();
            subjects.add("Maths");
            subjects.add("Biology");
            subjects.add("History");
            subjects.add("Physics");
            subjects.add("PE");
            subjects.add("Literature");
            subjects.add("Economics");
            subjects.add("Computing");
            return subjects;

        };
        IPrintSubjects printingSubjects = (IAddSubject addingSubjects) ->
                LOGGER.info("They have also been sorted within stream, here they are: \n "
                        + addingSubjects
                        .addSubject()
                        .stream()
                        .sorted()
                        .collect(Collectors.toList()));
        printingSubjects.printSubjects(addSubjects);
        LOGGER.info("\n");

        ICreateExamsQualifications qualifications = () -> {
            LOGGER.info("Now let's Create a HashMap with a key and a value: ");
            HashMap<String, Integer> settingQualificationAndExams = new HashMap<>();
            settingQualificationAndExams.put("Maths", 8);
            settingQualificationAndExams.put("Biology", 4);
            settingQualificationAndExams.put("History", 7);
            settingQualificationAndExams.put("PE", 10);
            settingQualificationAndExams.put("Englsih", 8);
            settingQualificationAndExams.put("Physics", 6);

            return settingQualificationAndExams;
        };
        IPrintQualificationsAndExams printingQualifications = (ICreateExamsQualifications qualif) ->
                LOGGER.info("Here we have just created some exams and its qualifications: \n " +
                        qualif.creatingExamsQualifications());
        printingQualifications.printExams(qualifications);


    }
}
