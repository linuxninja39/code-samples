package net.s56.net.s56.commandModules;

/**
 * Created by jacob on 9/2/15.
 */
public class Factorial implements CommandModuleInterface {
    public static final String NAME = "Factorial";
    private Integer number;

    public Factorial(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.number);
        System.out.println(this.getFactorial());
    }

    @Override
    public String getName() {
        return NAME;
    }

    public Integer getFactorial() {
        if (number == 0) return 1;

        int currentNumber = 1;
        for (int i = number; i > 0; i--) {
            currentNumber = currentNumber * i;
        }
        return currentNumber;
    }
}
