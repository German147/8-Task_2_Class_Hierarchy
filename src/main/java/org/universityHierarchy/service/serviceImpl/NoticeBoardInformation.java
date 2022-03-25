package org.universityHierarchy.service.serviceImpl;

import org.universityHierarchy.service.INoticeBoard;

public abstract class NoticeBoardInformation implements INoticeBoard {

    public abstract void showMonthlyActivityCalendar();

    public abstract void showYearlyActivityCalendar();

    @Override
    public void showExamNotice() {

    }

    @Override
    public void showResultQualifications() {

    }

    @Override
    public void showDateExams() {

    }

    @Override
    public void showYearlyPlanningTopics() {

    }
}
