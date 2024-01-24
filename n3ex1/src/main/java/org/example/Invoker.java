package org.example;

import org.example.Commands.Command;

import java.util.ArrayList;

public class Invoker {
    private final ArrayList<Command> commands;
    public Invoker(ArrayList<Command> commands){
        this.commands = commands;
    }
    public void execute(){
        this.commands.forEach(Command::execute);
    }
}
