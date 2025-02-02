package ConsoleInteraction;

public class BSelectedState implements State {
    private final ConsoleInteraction consoleInteraction;
    private final int a;
    private final int b;

    public BSelectedState(ConsoleInteraction consoleInteraction, int a, int b) {
        this.consoleInteraction = consoleInteraction;
        this.a = a;
        this.b = b;
    }

    @Override
    public String print() {
        return "Area=" + (a * b) + ", Circumference=" + (2 * (a + b));
    }

    @Override
    public void input(String answer) {
        //do nothing
    }
}