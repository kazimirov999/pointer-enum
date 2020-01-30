import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Види напрямків Java");
        TypeJava.javaPlatform();
        System.out.println("Зроби вибір, в який напрямок ти підеш");
        String writeJava = scan.nextLine();
        scan.close();
        TypeJava.showJavaPlatform(TypeJava.valueOf(writeJava));
    }
}
