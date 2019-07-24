package pointer.enums.commands;

public enum Command {
    EXIT("exit"),
    DONE("done"),
    SEARCH("search"),
    ADD("add"),
    UPDATE("update"),
    REMOVE("rm");

    private String command;

    Command(String command) {
        this.command = command;
    }

    public static Command fromString(String value) {
        for (Command c : Command.values()) {
            if (c.command.equals(value)) {
                return c;
            }
        }
        return null;
    }
}
