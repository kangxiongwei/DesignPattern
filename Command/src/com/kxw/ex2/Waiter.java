package com.kxw.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangxiongwei 2015/9/14
 */
public class Waiter {

    private List<Command> commands = new ArrayList<Command>();

    public Waiter() {
    }

    public void addCommands(Command command){
        this.commands.add(command);
    }

    public void removeCommands(Command command){
        this.commands.remove(command);
    }

    public void sail(){
        for (Command command: commands){
            command.sail();
        }
    }
}
