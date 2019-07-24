package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class UpdateCommand extends AbstractCommand {
    public UpdateCommand(StoreManager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        if (!verify())
            return;

        storeManager.updateFood();
    }
}
