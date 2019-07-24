package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class ExitCommand extends AbstractCommand {
    public ExitCommand(StoreManager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        if (storeManager.getStore() != null) {
            System.out.println("You have had a store with name: " + storeManager.getStore().getName());
            System.out.println("Foods in it: " + storeManager.getStore().getFoods());
        }
        storeManager.close();
        System.exit(0);
    }
}
