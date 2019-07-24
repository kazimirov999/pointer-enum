package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class CommandFactory {
    private StoreManager storeManager;

    public CommandFactory(StoreManager manager) {
        storeManager = manager;
    }

    public AbstractCommand getCommand(Command command) {
        if (command == null){
            System.out.println("Wrong command " + storeManager.commandArr()[0]);
            storeManager.nextLine();
            return  null;
        }

        switch (command) {
            case ADD: return new AddCommand();
            case SEARCH: return new SearchCommand();
            case UPDATE: return new UpdateCommand();
            case REMOVE: return new RemoveCommand();
            case DONE:
            case EXIT: return new ExitCommand();
        }

        return null;
    }

    public AbstractCommand getNextCommand() {
        storeManager.nextLine();
        Command command = Command.fromString(storeManager.commandArr()[0]);
        return getCommand(command);
    }
}
