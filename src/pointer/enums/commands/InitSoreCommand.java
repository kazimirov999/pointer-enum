package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class InitSoreCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        manager.nextLine();
        Command command = Command.fromString(manager.commandArr()[0]);

        if (Command.EXIT == command) {
            new ExitCommand().execute(manager);
        } else {
            manager.setStore();
        }
    }
}
