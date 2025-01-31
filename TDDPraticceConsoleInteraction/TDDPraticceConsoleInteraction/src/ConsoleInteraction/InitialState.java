package ConsoleInteraction;

public class InitialState implements State {
    private final ConsoleInteraction consoleInteraction;

    public InitialState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    public String print() {
        return "C or R";
    }

    public void input(String answer) {
        if (answer.equals("R")) {
            consoleInteraction.setState(new RectangleSelectedState(this.consoleInteraction));
        }
    }
}