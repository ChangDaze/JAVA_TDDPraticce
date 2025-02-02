package ConsoleInteraction;

public class CircleSelectedState implements State {
    private final ConsoleInteraction consoleInteraction;
    public CircleSelectedState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    @Override
    public String print() {
        return "Circle radius?";
    }

    @Override
    public void input(String answer) {
        try {
            consoleInteraction.setState(new RadiusState(this.consoleInteraction, Integer.parseInt(answer)));
        } catch (Exception e) {
            //do nothing
        }
    }
}
