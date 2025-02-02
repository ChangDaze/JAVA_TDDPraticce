package ConsoleInteraction;

public class ASelectedState implements State {
    private final ConsoleInteraction consoleInteraction;
    private final int a;

    public ASelectedState(ConsoleInteraction consoleInteraction, int a) {
        this.consoleInteraction = consoleInteraction;
        this.a = a;
    }

    @Override
    public String print() {
        return "Rectangle side B length?";
    }

    @Override
    public void input(String answer) {
        try {
            consoleInteraction.setState(new BSelectedState(this.consoleInteraction, a, Integer.parseInt(answer)));
        } catch (Exception e) {
            //do nothing
        }
    }
}