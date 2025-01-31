package ConsoleInteraction;

public class BSelectedState implements State {
    private final ConsoleInteraction consoleInteraction;

    public BSelectedState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    public String print() {
        return "Area=" + (consoleInteraction.getA() * consoleInteraction.getB()) + ", Circumference=" + (2 * (consoleInteraction.getA() + consoleInteraction.getB()));
    }

    public void input(String answer) {
        //do nothing
    }
}