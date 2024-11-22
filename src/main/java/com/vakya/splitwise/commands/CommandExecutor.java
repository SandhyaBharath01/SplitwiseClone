package com.vakya.splitwise.commands;

import java.util.List;

public class CommandExecutor {

    public static List<Command> commands = List.of(

    );

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute(String input) {
        for (Command command : commands) {
            if (command.matches(input)) {
                command.execute(input);
                break;
            }
        }
    }
}