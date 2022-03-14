package org.universityHierarchy;

public class NoticeBoard {

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

    public void showExamNotice() {
    }

    public void showPaymentNotice() {
    }

    @Override
    public String toString() {
        return "NoticeBoard{" +
                "noticeTile='" + noticeTile + '\'' +
                '}';
    }
}
