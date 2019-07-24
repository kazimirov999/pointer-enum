package pointer.enums;

import pointer.enums.commands.*;
import pointer.enums.foodstore.StoreManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoreManager storeManager = new StoreManager(new Scanner(System.in));
        CommandFactory commandFactory = new CommandFactory(storeManager);

        System.out.println("Type 'exit' for close app");
        System.out.println("Type a store name:");

        storeManager.execute(new InitSoreCommand());
        storeManager.execute(new FillInStoreCommand());

        System.out.println("Use add <food type> <food name> <price> <quantity>.\nUse 'search <food type> or <food name> for displaying all food with type.\nUse 'update <food name> <price> <quantity> for changing food'\nUse rm <food name> for removing from the store.");
        AbstractCommand command = commandFactory.getNextCommand();

        while (true){
            if (command == null){
                System.out.println("Command is not recognized.");
                command = commandFactory.getNextCommand();
                continue;
            }

            storeManager.execute(command);
            command = commandFactory.getNextCommand();
        }
    }
}