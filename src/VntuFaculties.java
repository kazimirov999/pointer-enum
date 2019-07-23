public enum VntuFaculties {
    FCSA("Faculty of Computer Systems and Automation"),
    FCHPGS("Faculty of Construction, Heat Power and Gas Supply"),
    FPEE("Faculty of Power Engineering and Electromechanics"),
    FITCE("Faculty of Information Technology and Computer Engineering"),
    FMET("Faculty of Mechanical Engineering and Transport"),
    FIRaN("Faculty of Infocommunications, Radioelectronics and Nanosystems"),
    FMIS("Faculty of Management and Information Security"),
    FESEM("Faculty of Ecological Safety and Environmental Monitoring");

    private String facultyName;
    private static VntuFaculties[] facultiesList = VntuFaculties.values();

    VntuFaculties(String facultyName) {
        this.facultyName = facultyName;
    }

    public String toString() {
        return facultyName;
    }

    static void showFacultiesList() {
        for (VntuFaculties facultyNames : facultiesList) {
            System.out.println(facultyNames.name());
        }
    }

    static void showChosenFaculty(VntuFaculties facultyName) {
            switch (facultyName) {
                case FCSA:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FCHPGS:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FPEE:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FITCE:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FMET:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FIRaN:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FMIS:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
                case FESEM:
                    System.out.println("We are " + facultyName.toString() + " and we do really useless stuff!");
                    return;
            }
        }
    }
