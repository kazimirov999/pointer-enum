import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаю! Оберіть регіон в якому Ви бажаєте проживати: ");
        Regions.showRegionsList();
        System.out.println("Впишіть назву регіону: ");
        String write = scanner.nextLine();
        scanner.close();
        Regions.showRegions(Regions.valueOf(write));
        System.out.println("З новосіллям Вас. Тепер Ви живете в: " + write + "І");
    }
}
