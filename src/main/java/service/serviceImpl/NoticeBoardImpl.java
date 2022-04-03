package service.serviceImpl;

import service.INoticeBoard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NoticeBoardImpl implements INoticeBoard {

    private static final Logger LOGGER = LogManager.getLogger(NoticeBoardImpl.class);

    @Override
    public void showExamNotice() {
        LOGGER.info("Exams will be put off to next month");
    }

    @Override
    public void showResultQualifications() {
        LOGGER.info("The result qualification will be available soon");
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
