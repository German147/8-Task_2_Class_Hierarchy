package service.serviceImpl;

import service.INoticeBoard;

import java.util.HashMap;

public abstract class NoticeBoardInformation implements INoticeBoard {

    public abstract void showMonthlyActivityCalendar();

    public abstract void showYearlyActivityCalendar();

    @Override
    public void showExamNotice(HashMap<String, Integer> qualifications) {

    }

    @Override
    public void showDateExams() {

    }

    @Override
    public void showYearlyPlanningTopics() {

    }
}
