package javacore.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PolitehnicInstitute mehanical = PolitehnicInstitute.MECHANICAL;
        PolitehnicInstitute enerhetic = PolitehnicInstitute.ENERHETIC;
        PolitehnicInstitute informative = PolitehnicInstitute.INFORMATIVE;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть дані для пошуку");
        String txt = scan.nextLine();
        String t = txt.toLowerCase();
        switch (t) {
            case "механіка":
                System.out.println("Факультет засновано в " + mehanical.getYears() + " році.\n" +
                        "з відкриття в ньому навчалося " + mehanical.getStudents() + " студентів");
                break;
            case "енергетика":
                System.out.println("Факультет засновано в " + enerhetic.getYears() + " році.\n"
                        + enerhetic.getStudents() + " студентів");
                break;
            case "інформатика":
                System.out.println("Факультет засновано в " + informative.getYears() + " році.\n"
                        + "з відкриття в ньому навчалося " + informative.getStudents() + " студентів");
                break;
            case "заснування":
                System.out.println(mehanical.getYears() + "р.\n" + informative.getYears() + "р.\n"
                        + enerhetic.getYears() + "р.");
            case "политех":
                System.out.println("Факультет " + mehanical + "\n" + "Факультет засновано в "
                        + mehanical.getYears() + " році.\n" + "з відкриття в ньому навчалося "
                        + mehanical.getStudents() + " студентів");
                System.out.println("-----------------------------------");
                System.out.println("Факультет " + enerhetic + "\n" + "Факультет засновано в "
                        + enerhetic.getYears() + " році.\n" + "з відкриття в ньому навчалося "
                        + enerhetic.getStudents() + " студентів");
                System.out.println("-----------------------------------");
                System.out.println("Факультет " + informative + "\n" + "Факультет засновано в "
                        + informative.getYears() + " році.\n" + "з відкриття в ньому навчалося "
                        + informative.getStudents() + " студентів");
        }
    }
}


