package pointer.enums;

import pointer.enums.commands.AbstractCommand;
import pointer.enums.commands.Command;
import pointer.enums.commands.CommandFactory;
import pointer.enums.commands.CommandReader;
import pointer.enums.foodstore.FoodType;
import pointer.enums.foodstore.StoreManager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CommandReader reader = new CommandReader(new Scanner(System.in));
        StoreManager storeManager = new StoreManager();
        CommandFactory commandFactory = new CommandFactory(storeManager, reader);

        System.out.println("Type 'exit' for close app");

        AbstractCommand initStoreCommand = new AbstractCommand(storeManager, reader) {
            @Override
            public void execute() {
                System.out.println("Type a store name:");
                reader.nextLine();
                Command command = Command.fromString(reader.commandArr()[0]);

                if (Command.EXIT == command) {
                    manager.executeCommand(commandFactory.getCommand(Command.EXIT));
                } else {
                    manager.setStore(reader.getLine());
                }
            }
        };

        AbstractCommand fillInStoreCommand = new AbstractCommand(storeManager, reader) {
            @Override
            public void execute() {
                System.out.println("Food types: " + Arrays.toString(FoodType.values()) +
                        "\nUse 'done' when finish. \nUse add <food type> <food name> <price> <quantity>:");
                reader.nextLine();
                Command command = Command.fromString(reader.commandArr()[0]);

                while (Command.DONE != command) {
                    manager.executeCommand(commandFactory.getCommand(command));
                    reader.nextLine();
                    command = Command.fromString(reader.commandArr()[0]);
                }
            }
        };

        storeManager.executeCommand(initStoreCommand);
        storeManager.executeCommand(fillInStoreCommand);

        System.out.println("Use add <food type> <food name> <price> <quantity>.\nUse 'search <food type> or <food name> for displaying all food with type.\nUse 'update <food name> <price> <quantity> for changing food'\nUse rm <food name> for removing from the store.");
        AbstractCommand command = commandFactory.getNextCommand();

        while (true){
            if (command == null){
                System.out.println("Command is not recognized.");
                command = commandFactory.getNextCommand();
                continue;
            }

            storeManager.executeCommand(command);
            command = commandFactory.getNextCommand();
        }
    }
}