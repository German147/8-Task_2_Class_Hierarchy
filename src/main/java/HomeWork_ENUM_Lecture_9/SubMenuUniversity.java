package HomeWork_ENUM_Lecture_9;

public enum SubMenuUniversity {
    ;

    private final MainMenu mainMenu;
    private final EStudent EStudent;
    private final EResearch eResearch;

    SubMenuUniversity(MainMenu mainMenu, EStudent EStudent, EResearch eResearch) {
        this.mainMenu = mainMenu;
        this.EStudent = EStudent;
        this.eResearch = eResearch;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public HomeWork_ENUM_Lecture_9.EStudent getEStudent() {
        return EStudent;
    }

    public EResearch geteResearch() {
        return eResearch;
    }
}
