package pointer.enums.commands;

import pointer.enums.foodstore.CommandReader;

public class CommandFactory {
    private final CommandReader commandReader;

    public CommandFactory(CommandReader reader) {
        this.commandReader = reader;
    }

    public AbstractCommand getCommand(Command command) {
        if (command == null){
            System.out.println("Wrong command " + commandReader.commandArr()[0]);
            commandReader.nextLine();
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
        commandReader.nextLine();
        Command command = Command.fromString(commandReader.commandArr()[0]);
        return getCommand(command);
    }
}
