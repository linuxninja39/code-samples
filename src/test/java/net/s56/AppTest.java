package net.s56;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import net.s56.net.s56.commandModules.Buzz;
import net.s56.net.s56.commandModules.CommandModuleInterface;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Map<String, CommandModuleInterface> commandList;

    @Before
    public void setup() {
        commandList = new HashMap<>();
        commandList.put("Buzz", mock(Buzz.class));
    }

    @Test(expected = RuntimeException.class)
    public void testRunNamedCommandException()
    {
        App app = new App(commandList);
        app.runNamedCommand("bob");
    }


    @Test
    public void testRunNamedCommandSuccess() {
        App app = new App(commandList);
        String command = "Buzz";

        app.runNamedCommand(command);
        verify(commandList.get(command)).run();

    }

    @Test
    public void testRunAllSuccess() {
        App app = new App(commandList);
        app.runAll();
        for (String s : commandList.keySet()) {
            verify(commandList.get(s)).run();
        }
    }

}
