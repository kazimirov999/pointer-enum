package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class RemoveCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (verify(manager))
            return;

        Food f = manager.removeFood();
        if (f != null) {
            System.out.println(f + " is removed from store.");
        } else {
            System.out.println("Wrong food name.");
        }
    }
}
