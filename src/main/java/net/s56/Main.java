package net.s56;

import net.s56.net.s56.commandModules.Buzz;
import net.s56.net.s56.commandModules.CommandModuleInterface;
import net.s56.net.s56.commandModules.Intersection;
import net.s56.net.s56.commandModules.Reverse;

import java.util.HashMap;

/**
 * Created by jacob on 9/2/15.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, CommandModuleInterface> commandList = new HashMap<>();
        commandList.put(Buzz.NAME, new Buzz(100));
        commandList.put(Reverse.NAME, new Reverse("eBay is cool"));
        commandList.put(Intersection.NAME, new Intersection());

        App app = new App(commandList);

        if (args.length == 1) {
            app.runNamedCommand(args[0]);
        } else {
            app.runAll();
        }
    }
}
