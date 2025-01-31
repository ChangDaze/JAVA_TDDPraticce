package ConsoleInteraction;

public class ASelectedState implements State {
    private final ConsoleInteraction consoleInteraction;

    public ASelectedState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    public String print() {
        return "Rectangle side B length?";
    }

    public void input(String answer) {
        try {
            consoleInteraction.setB(Integer.parseInt(answer));
            consoleInteraction.setState(new BSelectedState(this.consoleInteraction));
        } catch (Exception e) {
            //do nothing
        }
    }
}