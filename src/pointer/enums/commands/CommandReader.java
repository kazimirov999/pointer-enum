package pointer.enums.commands;

import java.util.Scanner;

public class CommandReader {
    private final Scanner scanner;
    private String line;

    public CommandReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String nextLine() {
        return (line = scanner.nextLine());
    }

    public String getLine() {
        return line;
    }

    public String[] commandArr() {
        return line.split(" ");
    }


    public void close() {
        scanner.close();
    }
}
