package net.s56.net.s56.commandModules;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacob on 9/2/15.
 */
public class Buzz implements CommandModuleInterface {
    private Integer count;
    public static final String BUZZ = "Buzz";
    public static final String NAME = "Buzz";

    public Buzz(Integer count) {
        this.count = count;
    }

    @Override
    public void run() {
        List<String> outputArray = this.getOutputArray();
        for (String s : outputArray) {
            System.out.println(s);
        }
    }

    @Override
    public String getName() {
        return Buzz.NAME;
    }

    public List<String> getOutputArray() {
        List<String> outputArray = new ArrayList<>();
        for(int i = 1; i <= this.count; i++) {
            if ((i % 7) == 0) {
                outputArray.add(Buzz.BUZZ);
            } else if (this.isRepeating(i)) {
                outputArray.add(Buzz.BUZZ);
            } else {
                outputArray.add(String.valueOf(i));
            }
        }
        return outputArray;
    }

    private boolean isRepeating(int i) {
        String numberString = String.valueOf(i);
        String[] numbers = numberString.split("");
        if (numbers.length < 2) return false;
        String control = numbers[0];
        for(String n: numbers) {
            if (!n.equals(control)) return false;
        }
        return true;
    }
}
