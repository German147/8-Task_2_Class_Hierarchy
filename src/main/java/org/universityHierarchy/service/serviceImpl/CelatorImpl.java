package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ICelator;

import java.util.HashMap;

public class CelatorImpl implements ICelator {
    static final Logger LOGGER = LogManager.getLogger(CelatorImpl.class);

    @Override
    public HashMap<String, Integer> studentsQualifications() {
        HashMap<String, Integer> qualifications = new HashMap<>();
        qualifications.put("ortiz Marcos", 7);
        qualifications.put("Leiva Juan", 8);
        qualifications.put("Martrinez Fabio", 10);
        return qualifications;
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
