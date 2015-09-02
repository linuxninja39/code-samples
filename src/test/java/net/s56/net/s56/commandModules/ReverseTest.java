package net.s56.net.s56.commandModules;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jacob on 9/2/15.
 */
public class ReverseTest {

    @Test
    public void testGetFullReverse() {
        Reverse reverse = new Reverse("My Test");

        String reversedString = reverse.getFullReverse();

        assertEquals(reversedString, "tseT yM");
    }

    @Test
    public void testGetWordReverse() {
        Reverse reverse = new Reverse("My Test");

        String reversedString = reverse.getWordReverse();

        assertEquals(reversedString, "yM tseT");
    }
}
