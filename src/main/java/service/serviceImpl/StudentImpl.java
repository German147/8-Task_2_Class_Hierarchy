package service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.entity.People;
import org.universityHierarchy.entity.Student;
import service.IStudent;

import java.util.Scanner;
import java.util.function.Consumer;


public class StudentImpl extends People implements IStudent {

    private static final Logger LOGGER = LogManager.getLogger(StudentImpl.class);
    private static final Scanner scanner = new Scanner(System.in);
    static Consumer<Student> greetCustomerFunction = student ->
            System.out.println("Hello " + student.getName() + " Thanks for registering" +
                    "your phone number " + student.getPhoneNumber());
    private static int[] qualifications;

    @Override
    public int getExamsTotalAverageQualifications(double qualifications, int examsNumber) {
        return 0;
    }

    @Override
    public int setExamsQuantity() {
        return 0;
    }

    @Override
    public void addStudentInformation() {

    }

    @Override
    public int getHighestQualification(int[] qualifications) {
        return 0;
    }

    @Override
    public int getLowestQualification(int[] qualifications) {
        return 0;
    }

    @Override
    public int[] setQualificationsExams(int quantityExams) {
        return new int[0];
    }

    @Override
    public double calculateSumOfQualifications(int[] qualifications) {
        return 0;
    }
//    @Override
//    public void addStudentInformation() {
//        StudentImpl student1 = new StudentImpl();
//        LOGGER.info("Enter the following student's data: ");
//        LOGGER.info("Enter your name");
//        String name = scanner.nextLine();
//        student1.setName(name);
//        LOGGER.info("Enter your surname");
//        String surname = scanner.nextLine();
//        student1.setSurname(surname);
//        LOGGER.info("Enter your phone number");
//        String phone = scanner.nextLine();
//        student1.setPhoneNumber(phone);
//        LOGGER.info("Enter your neighborhood");
//        String neighborhood = scanner.nextLine();
//        student1.setNeighborhoodName(neighborhood);
//        LOGGER.info("Enter the state you live");
//        String state = scanner.nextLine();
//        student1.setStateName(state);
//        LOGGER.info("Enter country name");
//        String country = scanner.nextLine();
//        student1.setCountryName(country);
//        LOGGER.info("All Student information was set");
//    }
//
//    @Override
//    public int setExamsQuantity() {
//        int examsNumber;
////        LOGGER.info("Enter the amount of exams taken: ");
////        examsNumber = scanner.nextInt();
////        return examsNumber;
//    }
//
//    @Override
//    public int[] setQualificationsExams(int examsNumber) {
//        try {
//            for (int i = 0; i < examsNumber; i++) {
//                LOGGER.info("Enter the qualifications exams: " + (i + 1));
//                //     grades = new int[scanner.nextInt()];
//                qualifications = new int[scanner.nextInt()];
//            }
//            return qualifications;
//        } catch (RuntimeException e) {
//            LOGGER.debug(e);
//            throw new QualificationExamsNotFound("The qualifications of the exams were not set");
//        }
//    }
//
//    @Override
//    public int getHighestQualification(int[] examsNotes) {
//        //definimos e inicializamos la variable al primer numero del array
//        try {
//            int highest = examsNotes[0];
//            for (int qualification : examsNotes) {
//                if (qualification > highest) {
//                    highest = qualification;
//                }
//            }
//            return highest;
//        } catch (RuntimeException e) {
//            LOGGER.debug(e);
//            throw new HighestQualificationNotFound("The highest qualification was not found");
//        }
//
//    }
//
//    @Override
//    public int getLowestQualification(int[] exmasNotes) {
//        //definimos e inicializamos la variable al primer numero del array
//        int lowest = exmasNotes[0];
//        for (int numQualification : exmasNotes) {
//            if (numQualification < lowest) {
//                lowest = numQualification;
//            }
//        }
//        return lowest;
//    }
//
//    @Override
//    public int getExamsTotalAverageQualifications(double sumOfQualification, int examsNumber) {
//        return (int) (sumOfQualification / examsNumber);
//    }
//
//    @Override
//    public double calculateSumOfQualifications(int[] examsNotes) {
//        //definimos e iniciamos la variable acumulador
//        int sumOfQualifications = 0;
//        //iteramos con un for hence loop
//        for (int qualification : examsNotes) {
//            sumOfQualifications = sumOfQualifications + qualification;
//        }
//        return sumOfQualifications;
//    }

}
