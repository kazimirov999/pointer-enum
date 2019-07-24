package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class AddCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (verify(manager)) {
            Food f = manager.addFood();
            if (f != null) {
                System.out.println(f + " is added to store.");
            } else {
                System.out.println("Food is not is added.");
            }
        }
    }
}
