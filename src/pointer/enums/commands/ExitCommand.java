package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class ExitCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (manager.getStore() != null) {
            System.out.println("You have had a store with name: " + manager.getStore().getName());
            System.out.println("Foods in it: " + manager.getStore().getFoods());
        }
        manager.close();
        System.exit(0);
    }
}
