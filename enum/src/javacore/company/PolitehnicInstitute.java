package javacore.company;

public enum PolitehnicInstitute {
    ENERHETIC(1985, 20000),
    INFORMATIVE(1980, 25000),
    MECHANICAL(1982, 19800);

    public int years;
    public int students;

    PolitehnicInstitute(int years, int students) {
        this.years = years;
        this.students = students;
    }

    public int getYears() {
        return years;
    }

    public int getStudents() {
        return students;
    }


}



