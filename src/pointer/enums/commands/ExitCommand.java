package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(StoreManager manager, CommandReader reader) {
        super(manager, reader);
    }

    @Override
    public void execute() {
        if (manager.getStore() != null) {
            System.out.println("You have had a store with name: " + manager.getStore().getName());
            System.out.println("Foods in it: " + manager.getStore().getFoods());
        }
        reader.close();
        System.exit(0);
    }
}
