package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public abstract class AbstractCommand {

    protected StoreManager manager;
    protected CommandReader reader;

    public AbstractCommand(StoreManager manager, CommandReader reader) {
        this.manager = manager;
        this.reader = reader;
    }

    public abstract void execute();

    boolean verify() {
        if (reader.commandArr().length == 1) {
            System.out.println("No command parameters.");
            reader.nextLine();
            return true;
        }

        return false;
    }
}
