package net.s56.net.s56.commandModules;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacob on 9/2/15.
 */
public class BuzzTest {

    @Test
    public void testGetOutputArray() {
        int size = 14;
        Buzz buzz = new Buzz(size);

        List<String> outputArray = buzz.getOutputArray();

        assertEquals(outputArray.size(), size);
        assertEquals(outputArray.get(6), Buzz.BUZZ);
        assertEquals(outputArray.get(10), Buzz.BUZZ);
        assertEquals(outputArray.get(13), Buzz.BUZZ);
    }
}
