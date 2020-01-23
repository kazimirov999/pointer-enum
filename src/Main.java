import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет, выбери себе телефон из списка возможных: ");
        PhoneShop.showPhoneList();
        System.out.println("Просто напечатай нужный тебе телефон в форму ниже: ");
        String writeYourPhone = in.nextLine();
        PhoneShop.showPhone(PhoneShop.valueOf(writeYourPhone));

    }
}
