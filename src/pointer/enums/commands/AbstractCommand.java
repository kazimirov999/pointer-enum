package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public abstract class AbstractCommand {
    protected StoreManager storeManager;

    public AbstractCommand(StoreManager manager) {
        storeManager = manager;
    }

    public abstract void execute();

    protected boolean verify() {
         if (storeManager.commandArr().length == 1) {
            System.out.println("No command parameters.");
            storeManager.nextLine();
            return false;
        }

         return true;
    }
}
