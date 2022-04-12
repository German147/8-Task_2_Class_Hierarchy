package service.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.INoticeBoard;

import java.util.HashMap;

public class NoticeBoardImpl implements INoticeBoard {

    private static final Logger LOGGER = LogManager.getLogger(NoticeBoardImpl.class);

    @Override
    public void showExamNotice(HashMap<String, Integer> qualifications) {
        LOGGER.info("Exams will be put off to next month");

    }

    @Override
    public void printQualifications(HashMap<String, Integer> qualification) {

        LOGGER.info("The result qualification are: ");
        LOGGER.info(qualification);

    }

    @Override
    public void showDateExams() {
        LOGGER.info("The date of the following exams are from April 23, to June 15");
    }

    @Override
    public void showYearlyPlanningTopics() {
        LOGGER.info("In Maths you will learn algorithm and functions");
    }
}
