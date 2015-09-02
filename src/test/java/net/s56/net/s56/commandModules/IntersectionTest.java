package net.s56.net.s56.commandModules;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jacob on 9/2/15.
 */
public class IntersectionTest {

    @Test
    public void testFindIntersection() {
        int[] a = {1,4,6,9};
        int[] b = {1,4,5,8,9};

        Intersection intersection = new Intersection();

        int[] ret = intersection.findIntersection(a,b);

        int[] control = {1,4,9};

        assertArrayEquals(ret, control);
    }
}
