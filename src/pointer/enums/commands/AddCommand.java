package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class AddCommand extends AbstractCommand {

    public AddCommand(StoreManager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        if (verify()) {
            Food f = storeManager.addFood();
            if (f != null) {
                System.out.println(f + " is added to store.");
            } else {
                System.out.println("Food is not is added.");
            }
        }
    }
}
