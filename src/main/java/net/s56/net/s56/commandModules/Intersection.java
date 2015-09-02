package net.s56.net.s56.commandModules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jacob on 9/2/15.
 */
public class Intersection implements CommandModuleInterface {
    public static final String NAME = "Intersection";

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return NAME;
    }

    public int[] findIntersection(int[] a, int[] b) {
        ArrayList<Integer> returnArray = new ArrayList<>();
        for(int i: a) {
            for (int j: b) {
                if (i == j) {
                    returnArray.add(i);
                }
            }
        }
        return Intersection.convertToPrimitive(returnArray);
    }

    private static int[] convertToPrimitive(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }
}
