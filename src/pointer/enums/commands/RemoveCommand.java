package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class RemoveCommand extends AbstractCommand {
    public RemoveCommand(StoreManager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        if (!verify())
            return;

        Food f = storeManager.removeFood();
        System.out.println(f + " is removed from store.");
    }
}
