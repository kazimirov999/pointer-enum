import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! There are abbreviated names of Vinnytsia National Technical University faculties:");
        VntuFaculties.showFacultiesList();
        System.out.println("Choose (write in the same register) one of them to see full name of faculty and know what people do there.");
        String writtenFaculty = scan.nextLine();
        scan.close();
        VntuFaculties.showChosenFaculty(VntuFaculties.valueOf(writtenFaculty));
    }
}
