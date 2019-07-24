package pointer.enums;

import pointer.enums.commands.Command;
import pointer.enums.commands.CommandFactory;
import pointer.enums.commands.AbstractCommand;
import pointer.enums.foodstore.StoreManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StoreManager storeManager = new StoreManager(new Scanner(System.in));
        CommandFactory commandFactory = new CommandFactory(storeManager);

        System.out.println("Type 'exit' for close app");
        System.out.println("Type a store name:");

        storeManager.initStore();
        storeManager.fillInStore();

        System.out.println("Use add <food type> <food name> <price> <quantity>.\nUse 'search <food type> or <food name> for displaying all food with type.\nUse 'update <food name> <price> <quantity> for changing food'\nUse rm <food name> for removing from the store.");
        Command command = getNextCommand(storeManager);

        while (true){
            if (command == Command.DONE) {
                command = command.EXIT;
            }

            AbstractCommand c = commandFactory.getCommand(command);

            if (c == null){
                System.out.println("Command is not recognized.");
                command = Command.fromString(storeManager.commandArr()[0]);
                continue;
            }

            c.execute();
            command = getNextCommand(storeManager);
        }
    }

    private static Command getNextCommand(StoreManager storeManager) {
        storeManager.nextLine();
        return Command.fromString(storeManager.commandArr()[0]);
    }
}
