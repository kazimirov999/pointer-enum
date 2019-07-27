package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class CommandFactory {
    private final StoreManager manager;
    private final CommandReader reader;

    public CommandFactory(StoreManager manager, CommandReader reader) {
        this.manager = manager;
        this.reader = reader;
    }

    public AbstractCommand getCommand(Command command) {
        if (command == null){
            System.out.println("Wrong command " + reader.commandArr()[0]);
            reader.nextLine();
            return  null;
        }

        switch (command) {
            case ADD:
                return new AddCommand(manager, reader);
            case SEARCH:
                return new SearchCommand(manager, reader);
            case UPDATE:
                return new UpdateCommand(manager, reader);
            case REMOVE:
                return new RemoveCommand(manager, reader);
            case DONE:
            case EXIT:
                return new ExitCommand(manager, reader);
        }

        return null;
    }

    public AbstractCommand getNextCommand() {
        reader.nextLine();
        Command command = Command.fromString(reader.commandArr()[0]);
        return getCommand(command);
    }
}
