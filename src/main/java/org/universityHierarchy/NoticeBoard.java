package org.universityHierarchy;

public class NoticeBoard extends NoticeBoardInformation {

    private String noticeTile;

    public NoticeBoard() {
    }

    public NoticeBoard(String noticeTile) {
        this.noticeTile = noticeTile;
    }

    public String getNoticeTile() {
        return noticeTile;
    }

    public void setNoticeTile(String noticeTile) {
        this.noticeTile = noticeTile;
    }

    @Override
    public void showMonthlyActivityCalendar() {

    }

    @Override
    public void showYearlyActivityCalendar() {

    }

    @Override
    public void showExamNotice() {
        System.out.println("Exam notice showed");
    }

    @Override
    public void showPaymentNotice() {
        System.out.println("Showing payment NOtice");
    }

    @Override
    public void showResultQualifications() {
        System.out.println("Showing Qualifications");
    }

    @Override
    public void showDateExams() {
        System.out.println("Shown Dates of the exams");
    }

    @Override
    public void showYearlyPlanningTopics() {
        System.out.println("Showing planning topics");
    }
}
