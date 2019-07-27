package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

public class RemoveCommand extends AbstractCommand {

    public RemoveCommand(StoreManager manager, CommandReader reader) {
        super(manager, reader);
    }

    @Override
    public void execute() {
        if (verify())
            return;

        Food f = manager.removeFood(reader.commandArr()[1]);
        if (f != null) {
            System.out.println(f + " is removed from store.");
        } else {
            System.out.println("Wrong food name.");
        }
    }
}
