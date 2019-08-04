import java.util.Scanner;

public class Main1{





        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to our market, we are selling:");
            FruitMarket.showFruits();
            System.out.println("Select (write in the same register)  the fruits you are interested in to find out the availability and price.");
            String writtenFruits = scan.nextLine();
            scan.close();
            FruitMarket.showChosenFruit(FruitMarket.valueOf(writtenFruits));



        }
    }
