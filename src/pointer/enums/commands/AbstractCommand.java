package pointer.enums.commands;

import pointer.enums.foodstore.CommandReader;
import pointer.enums.foodstore.StoreManager;

public abstract class AbstractCommand {

    public abstract void execute(StoreManager manager);

    boolean verify(CommandReader commandReader) {
        if (commandReader.commandArr().length == 1) {
            System.out.println("No command parameters.");
            commandReader.nextLine();
            return true;
        }

        return false;
    }
}
