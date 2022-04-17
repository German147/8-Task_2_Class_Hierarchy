package org.universityHierarchy;


import Lambda_Interfaces.ICreateExams;
import Lambda_Interfaces.ICreateExamsQualifications;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ICelator;
import org.universityHierarchy.service.serviceImpl.CelatorImpl;
import org.universityHierarchy.service.serviceImpl.TeacherImpl;


public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String universityName = " Cordoba University ";
    private static final String universityLocation = " South America ";


    public static void main(String[] args) {
/**
 *Here we create some object, and from them on, we call their implementations.
 * These implementations are based on lambda interfaces that passes information
 * among them here in the main.
 */
        TeacherImpl teacher = new TeacherImpl();
        ICreateExams listOfExams = teacher.examsCreated();
        teacher.printExams(listOfExams);

        ICelator celator = new CelatorImpl();
        ICreateExamsQualifications qualificationsList = celator.studentsQualifications();
        celator.printExamsAndQualifications(qualificationsList);

    }
}
