package src;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println(" Hello, you are in our fruit shop and we have:  ");
        Shop.giveFruits();
        System.out.println("Write your choice");
        String writeFruit = str.nextLine();
        str.close();
        Shop.showYourFruit(Shop.valueOf(writeFruit.toUpperCase()));


    }
}
