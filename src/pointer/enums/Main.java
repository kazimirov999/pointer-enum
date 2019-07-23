package pointer.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory storeFactory = new FoodStoreFactory();

        System.out.println("Type 'exit' for close app");
        System.out.println("Type a store name:");

        String input = scanner.nextLine();
        Store store = storeFactory.getStore(input);

        if (!Command.EXIT.isSame(input) )
            System.out.println("Food types: " + Arrays.toString(FoodType.values()) +
                    "\nUse 'done' when finish. Add new one food (type, name, price, quantity):");


        while (!Command.EXIT.isSame(input) &&  !Command.DONE.isSame(input)) {
            input = scanner.nextLine();
            store.addFood(storeFactory.getFood(input));
        }

        if (!Command.EXIT.isSame(input) )
            System.out.println("Use add <food type> <food name> <price> <quantity>.\nUse 'search <food type> or <food name> for displaying all food with type.\nUse 'update <food name> <price> <quantity> for changing food'\nUse rm <food name> for removing from the store.");

        while (!Command.EXIT.isSame(input) ){
            String[] arr = input.split(" ");

            if (Command.SEARCH.isSame(arr[0])) {
                if (arr.length == 1) {
                    System.out.println("Send <food type> or <food name> as the second parameter for search.");
                    continue;
                }

                ArrayList<Food> search = new ArrayList<>();

                if (FoodType.isType(arr[1])) {
                    FoodType type = FoodType.fromString(arr[1]);
                    search = store.doSearch(type);
                } else {
                    Food food = store.doSearch(arr[1]);

                    if (food != null)
                        search.add(food);
                }

                if (search.size() == 0) {
                    System.out.println("No search result.");
                    input = scanner.nextLine();
                    continue;
                }

                System.out.println("Search result: " + search);
            } else if (Command.UPDATE.isSame(arr[0])) {
                if (arr.length == 1) {
                    System.out.println("Use update <food name> <price> <quantity>.");
                    continue;
                }

                Food f = store.doSearch(arr[1]);
                storeFactory.updateFood(f, arr);
            } else if (Command.ADD.isSame(arr[0])) {
                if (arr.length == 1) {
                    System.out.println("Use add <food type> <food name> <price> <quantity>.");
                    continue;
                }

                store.addFood(storeFactory.getFood(input.substring(4)));
            } else if (Command.REMOVE.isSame(arr[0])) {
                if (arr.length == 1) {
                    System.out.println("Use rm <food name>.");
                    continue;
                }

                Food f = store.doSearch(arr[1]);
                store.removeFood(f);
                System.out.println("Food " + f + "is removed from store.");
            }
            else if (!Command.EXIT.isSame(input) && !Command.DONE.isSame(input)) {
                System.out.println("Command is not recognized.");
            }

            input = scanner.nextLine();
        }

        System.out.println("You have had a store with name: " + store.getName());
        System.out.println("Foods in it: " + store.getFoods());

        scanner.close();
    }
}
