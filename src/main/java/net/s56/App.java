package net.s56;

import net.s56.net.s56.commandModules.CommandModuleInterface;

import java.util.Map;

public class App
{
    private Map<String, CommandModuleInterface> commandList;

    public App(Map<String, CommandModuleInterface> commandList) {
        this.commandList = commandList;
    }

    public void runNamedCommand(String cmdName) {
        if (!commandList.containsKey(cmdName)) {
            throw new RuntimeException("Command Not found");
        }

        commandList.get(cmdName).run();
    }

    public void runAll() {
        for(String command: commandList.keySet()) {
            commandList.get(command).run();
        }
    }
}
