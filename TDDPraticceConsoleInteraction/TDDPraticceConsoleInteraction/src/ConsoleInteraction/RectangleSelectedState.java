package ConsoleInteraction;

public class RectangleSelectedState implements State  {
    private final ConsoleInteraction consoleInteraction;

    public RectangleSelectedState(ConsoleInteraction consoleInteraction) {
        this.consoleInteraction = consoleInteraction;
    }

    public String print() {
        return "Rectangle side A length?";
    }

    public void input(String answer) {
        try {
            consoleInteraction.setA(Integer.parseInt(answer));
            consoleInteraction.setState(new ASelectedState(this.consoleInteraction));
        } catch (Exception e) {
            //do nothing
        }
    }
}