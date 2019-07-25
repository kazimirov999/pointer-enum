package pointer.enums;

import pointer.enums.commands.AbstractCommand;
import pointer.enums.commands.Command;
import pointer.enums.commands.CommandFactory;
import pointer.enums.foodstore.StoreManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final StoreManager storeManager = new StoreManager(new Scanner(System.in));
        final CommandFactory commandFactory = new CommandFactory(storeManager);

        System.out.println("Type 'exit' for close app");
        System.out.println("Type a store name:");

        AbstractCommand initStoreCommand = new AbstractCommand() {
            @Override
            public void execute(StoreManager manager) {
                manager.nextLine();
                Command command = Command.fromString(manager.commandArr()[0]);

                if (Command.EXIT == command) {
                    manager.execute(commandFactory.getCommand(Command.EXIT));
                } else {
                    manager.setStore();
                }
            }
        };

        AbstractCommand fillInStoreCommand = new AbstractCommand() {
            @Override
            public void execute(StoreManager manager) {
                manager.nextLine();
                Command command = Command.fromString(manager.commandArr()[0]);

                while (Command.DONE != command) {
                    manager.execute(commandFactory.getCommand(command));
                    manager.nextLine();
                    command = Command.fromString(manager.commandArr()[0]);
                }
            }
        };

        storeManager.execute(initStoreCommand);
        storeManager.execute(fillInStoreCommand);

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