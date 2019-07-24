package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class UpdateCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (!verify(manager))
            return;

        manager.updateFood();
    }
}
