package org.universityHierarchy.service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.universityHierarchy.service.ICelator;

import java.util.HashMap;
import java.util.Scanner;

public class CelatorImpl implements ICelator {
    private static final Logger LOGGER = LogManager.getLogger(CelatorImpl.class);

    @Override
    public HashMap<String, Integer> studentsQualifications() {
        HashMap<String, Integer> studentsQualifications = new HashMap<>();

        // TODO: 30/03/2022 trycatch y exceptions 
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter the number of students: ");
        int studentNumber = scanner.nextInt();
        scanner.nextLine();
        while (studentNumber-- > 0) {
            LOGGER.info("Enter the name of the student: ");
            String name = scanner.nextLine();
            name = name.trim();
            LOGGER.info("Now enter the qualification, please: ");
            int contact = scanner.nextInt();
            scanner.nextLine();
            studentsQualifications.put(name, contact);
        }
        LOGGER.info(studentsQualifications);

        // obj.nextLine();

        String search = scanner.nextLine();
        if (studentsQualifications.containsKey(search)) {
            Integer a = studentsQualifications.get(search);
            LOGGER.info(search + "=" + a);
        } else {

            System.out.println("Not Found");
        }
        return studentsQualifications;
    }

    @Override
    public void takeAssistance() {

    }

    @Override
    public void addSubject() {

    }
}
