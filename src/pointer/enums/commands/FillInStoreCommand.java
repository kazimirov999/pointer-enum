package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class FillInStoreCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        CommandFactory commandFactory = new CommandFactory(manager);
        manager.nextLine();
        Command command = Command.fromString(manager.commandArr()[0]);

        while (Command.DONE != command) {
            manager.execute(commandFactory.getCommand(command));
            manager.nextLine();
            command = Command.fromString(manager.commandArr()[0]);
        }
    }
}
