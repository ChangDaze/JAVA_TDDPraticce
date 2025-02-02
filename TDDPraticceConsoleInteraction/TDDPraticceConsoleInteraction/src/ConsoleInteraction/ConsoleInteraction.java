package ConsoleInteraction;

// reference
//part 1 : https://www.youtube.com/watch?v=TO5ZsXUP9Mk
//part 2 : https://www.youtube.com/watch?v=4Zh4IPwV8fQ
//part 3 : https://www.youtube.com/watch?v=5Bx-87hBLz0&t=2s
public class ConsoleInteraction {
    private State state = new InitialState(this);

    public String print() {
        return this.state.print();
    }

    public void input(String answer) {
        this.state.input(answer);
    }

    public void setState(State state) {
        this.state = state;
    }
}
