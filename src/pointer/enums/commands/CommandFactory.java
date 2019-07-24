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
            case ADD: return new AddCommand(storeManager);
            case SEARCH: return new SearchCommand(storeManager);
            case UPDATE: return new UpdateCommand(storeManager);
            case REMOVE: return new RemoveCommand(storeManager);
            case EXIT: return new ExitCommand(storeManager);
        }

        return null;
    }
}
