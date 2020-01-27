package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Вітаю оберіть будь-ласка фільм з списку:");
        LibraryTopFilms.showFilmName();
        System.out.println("Напишіть свій улюблений фільм з урахуванням регістру");
        String writtenFilm = scan.nextLine();
        scan.close();
        LibraryTopFilms.showFilmName(LibraryTopFilms.valueOf(writtenFilm));
    }
}