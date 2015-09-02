package net.s56.net.s56.commandModules;

import java.util.ArrayList;

/**
 * Created by jacob on 9/2/15.
 */
public class Reverse implements CommandModuleInterface {
    public static final String NAME = "Reverse";
    private String msg;

    public Reverse(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(this.msg);
        System.out.println(this.getFullReverse());
        System.out.println(this.getWordReverse());
    }

    @Override
    public String getName() {
        return NAME;
    }

    public String getFullReverse() {
        return this.reverser(this.msg);
    }

    public String getWordReverse() {
        String[] words = this.msg.split(" ");
        ArrayList<String> stringArray = new ArrayList<>();
        for(String word: words) {
            stringArray.add(this.reverser(word));
        }

        return String.join(" ", stringArray);
    }

    private String reverser(String originalString) {
        char[] s = originalString.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }
}
