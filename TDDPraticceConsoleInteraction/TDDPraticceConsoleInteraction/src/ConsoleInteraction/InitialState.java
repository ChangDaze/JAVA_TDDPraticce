package ConsoleInteraction;

public class InitialState implements State {
    private final ConsoleInteraction consoleInteraction;

    public InitialState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    @Override
    public String print() {
        return "C or R";
    }

    @Override
    public void input(String answer) {
        if (answer.equals("R")) {
            consoleInteraction.setState(new RectangleSelectedState(this.consoleInteraction));
        }else if (answer.equals("C")){
            consoleInteraction.setState(new CircleSelectedState(this.consoleInteraction));
        }
    }
}