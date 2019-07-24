package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class RemoveCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (!verify(manager))
            return;

        Food f = manager.removeFood();
        System.out.println(f + " is removed from store.");
    }
}
