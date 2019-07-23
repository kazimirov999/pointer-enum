package pointer.enums;

public enum Command {
    EXIT("exit"),
    DONE("done"),
    SEARCH("search"),
    ADD("add"),
    UPDATE("update"),
    REMOVE("rm");

    private String command;

    Command(String c) {
        command = c;
    }

    boolean isSame(String c) {
        return command.equals(c);
    }
}
