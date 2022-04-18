package org.universityHierarchy.service.serviceImpl;

import Lambda_Interfaces.ICreateExamsQualifications;
import Lambda_Interfaces.ICreateSomething;
import Lambda_Interfaces.ILambdaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.People;
import org.universityHierarchy.service.ICelator;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static HomeWork_ENUM_Lecture_9.EGender.FEMALE;
import static HomeWork_ENUM_Lecture_9.EGender.MALE;

public class CelatorImpl implements ICelator {
    static final Logger LOGGER = LogManager.getLogger(CelatorImpl.class);

    /**
     * This method creates a list of student using an EGender Enum class,
     * this also implement an ICreateSomething generic Interface to create the list.
     *
     * @return an ICreateSomething interface with the list os student in it.
     */
    @Override
    public ICreateSomething<List<People>> createStudentList() {
        ILambdaService print = () -> LOGGER.info("Let's create a list of student: ");
        print.printSomething();

        ICreateSomething<List<People>> studentsList = () -> {
            List<People> students = List.of(
                    new People("Juan", "Molina", "789465", new Date(2005 - 04 - 03), MALE),
                    new People("Martha", "Bellini", "7415418", new Date(2004 - 06 - 07), FEMALE),
                    new People("Lorena", "Barrera", "852352", new Date(2003 - 07 - 01), FEMALE),
                    new People("Carlos", "Muller", "963147", new Date(2004 - 11 - 10), MALE)
            );
            return students;
        };
        return studentsList;
    }

    /**
     * This method prints the list of student created using an ICreateSomething generic lambda Interface
     *
     * @param listOfStudents takes the list of student created
     * @return an ICreateSomething Generic interface with the list of studen in it.
     */
    @Override
    public ICreateSomething printStudentList(ICreateSomething<List<People>> listOfStudents) {
        listOfStudents.createSomething().stream().forEach((People) -> LOGGER.info(
                " One students created is: "
                        + People.getName()
                        + ". His/Her surname is "
                        + People.getSurname()
                        + ". His/Her Phone number is "
                        + People.getPhoneNumber()
                        + ". His/Her birthday is "
                        + People.getBirthDate()
                        + ". His/Her gender is "
                        + People.getGender() + " .")

        );
        LOGGER.info("\n");
        return listOfStudents;
    }

    /**
     * This method creates a HashMap using an ICreateExamsQualifications interface.
     * It is also used an ILambdaService lo print a message
     *
     * @return a HashMap with String and Integer as values.They are students and
     * their qualifications
     */
    @Override
    public ICreateExamsQualifications studentsQualifications() {
        ILambdaService print = () -> LOGGER.info("Here we are Creating a HashMap with qualification and" +
                " grades from a lambda from the Service: ");
        print.printSomething();
        ICreateExamsQualifications createQualif = () -> {
            HashMap<String, Integer> qualifications = new HashMap<>();
            qualifications.put("Ortiz Marcos", 7);
            qualifications.put("Leiva Juan", 8);
            qualifications.put("Martrinez Fabio", 10);
            return qualifications;
        };
        return createQualif;
    }

    /**
     * This method uses an ICreateExamsQualifications interface to print its HashMap.
     *
     * @param examsAndQualifications takes the keys and values of the qualifications.
     * @return the information of the HashMap
     */
    @Override
    public ICreateExamsQualifications printExamsAndQualifications(ICreateExamsQualifications examsAndQualifications) {

        examsAndQualifications.creatingExamsQualifications().forEach((String, Integer) -> LOGGER.info(
                "The student " + String + " , has got the following qualification " + Integer
        ));
        return examsAndQualifications;
    }
//    @Override
//    public LinkedList<String> addSubject() {
//        LinkedList<String> subjects = new LinkedList<>();
//        subjects.add("Maths");
//        subjects.add("Biology");
//        subjects.add("History");
//        return subjects;
//    }

    //Scanner Class Approach
//    @Override
//    public HashMap<String, Integer> studentsQualifications() {
//        HashMap<String, Integer> studentsQualifications = new HashMap<>();
//
//
//        Scanner scanner = new Scanner(System.in);
//        LOGGER.info("Enter the number of students: ");
//        int studentNumber = scanner.nextInt();
//        scanner.nextLine();
//        while (studentNumber-- > 0) {
//            LOGGER.info("Enter the name of the student: ");
//            String name = scanner.nextLine();
//            name = name.trim();
//            LOGGER.info("Now enter the qualification, please: ");
//            int contact = scanner.nextInt();
//            scanner.nextLine();
//            studentsQualifications.put(name, contact);
//        }
//        LOGGER.info(studentsQualifications);
//
//        // obj.nextLine();
//
//        String search = scanner.nextLine();
//        if (studentsQualifications.containsKey(search)) {
//            Integer a = studentsQualifications.get(search);
//            LOGGER.info(search + "=" + a);
//        } else {
//
//            System.out.println("Not Found");
//        }
//        return studentsQualifications;
//    }
}
