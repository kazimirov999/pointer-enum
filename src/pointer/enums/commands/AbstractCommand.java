package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public abstract class AbstractCommand {

    public abstract void execute(StoreManager manager);

    protected boolean verify(StoreManager storeManager) {
         if (storeManager.commandArr().length == 1) {
            System.out.println("No command parameters.");
            storeManager.nextLine();
            return false;
        }

         return true;
    }
}
