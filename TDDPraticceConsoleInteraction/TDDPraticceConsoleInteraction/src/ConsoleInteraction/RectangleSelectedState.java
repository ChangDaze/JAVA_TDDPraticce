package ConsoleInteraction;

public class RectangleSelectedState implements State  {
    private final ConsoleInteraction consoleInteraction;

    public RectangleSelectedState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    @Override
    public String print() {
        return "Rectangle side A length?";
    }

    @Override
    public void input(String answer) {
        try {
            consoleInteraction.setState(new ASelectedState(this.consoleInteraction, Integer.parseInt(answer)));
        } catch (Exception e) {
            //do nothing
        }
    }
}