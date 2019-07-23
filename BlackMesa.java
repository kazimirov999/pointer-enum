import java.util.Arrays;
import java.util.Scanner;

public abstract class BlackMesa {
    static boolean flg = true;

    static Scanner in = new Scanner(System.in);

    static void menu(int a) {

        switch (a) {
            case 1:
                showAllDepartments();
                break;
            case 2:
                showAllActiveDepartments();
                break;
            case 3:
                System.out.println("Введіть назву відділу, як в Базі");
                showDepartmentInfo(in.nextLine().toUpperCase());
                break;
            case 4:
                System.out.println("Введіть назву відділу, як в Базі і кількість");
                addWorkers(in.nextLine().toUpperCase(), in.nextInt());
                break;
            case 5:
                System.out.println("Введіть назву відділу, як в Базі і кількість");
                removeWorkers(in.nextLine().toUpperCase(), in.nextInt());
                break;
            case 6:
                System.out.println("Введіть назву відділу, як в Базі і кількість");
                addMoney(in.nextLine().toUpperCase(), in.nextInt());
                break;
            case 7:
                System.out.println("Введіть назву відділу, як в Базі і кількість");
                removeMoney(in.nextLine().toUpperCase(), in.nextInt());
                break;
            case 8:
                System.out.println("Введіть назву відділу, як в Базі");
                activateDepartment(in.nextLine().toUpperCase());
                break;
            case 9:
                System.out.println("Введіть назву відділу, як в Базі");
                deActivateDepartment(in.nextLine().toUpperCase());
                break;
            default:
                System.out.println("EXITING...");
                flg = false;
                break;
        }
    }

    private static void showAllDepartments() {
        for (int i = 0; i < Department.values().length; ++i) {
            System.out.println(Department.values()[i].getTitle());
        }
    }


    private static void showAllActiveDepartments() {
        for (int i = 0; i < Department.values().length; ++i) {
            if (Department.values()[i].isActive()) {
                System.out.println("Активний --> " + Department.values()[i].getTitle());
            } else {
                System.out.println("Не активний --> " + Department.values()[i].getTitle());
            }
        }
    }

    private static void showDepartmentInfo(String s) {
        System.out.println("Назва в Базі == " + Department.valueOf(s).name() + "\n"
                + "Назва == " + Department.valueOf(s).getTitle() + "\n"
                + "Коментарій == " + Department.valueOf(s).getCommentary() + "\n"
                + "Бюджет == " + Department.valueOf(s).getMoney() + "\n"
                + "Кількість працівників == " + Department.valueOf(s).getWorkers() + "\n"
                + "Активний == " + Department.valueOf(s).isActive() + "\n");
    }

    private static void addWorkers(String s, int w) {
        Department.valueOf(s).setWorkers(Department.valueOf(s).getWorkers() + w);
        System.out.println(Department.valueOf(s).getTitle() + " розширили на " + w + " працівників");
    }

    private static void removeWorkers(String s, int w) {
        Department.valueOf(s).setWorkers(Department.valueOf(s).getWorkers() + w);
        System.out.println(Department.valueOf(s).getTitle() + " скоротили на " + w + " працівників");
    }

    private static void addMoney(String s, int m) {
        Department.valueOf(s).setMoney(Department.valueOf(s).getMoney() + m);
        System.out.println("Бюджет " + Department.valueOf(s).getTitle() + " збільшили на " + m + " $");
    }

    private static void removeMoney(String s, int m) {
        Department.valueOf(s).setMoney(Department.valueOf(s).getMoney() - m);
        System.out.println("Буджет " + Department.valueOf(s).getTitle() + " зменшили на " + m + " $");
    }

    private static void activateDepartment(String s) {
        if (!Department.valueOf(s).isActive()) {
            Department.valueOf(s).setActive(true);
        } else
            System.out.println("Відділ вже активний!!!");
    }

    private static void deActivateDepartment(String s) {
        if (Department.valueOf(s).isActive()) {
            Department.valueOf(s).setActive(false);
        } else
            System.out.println("Відділ не активний!!!");
    }


}