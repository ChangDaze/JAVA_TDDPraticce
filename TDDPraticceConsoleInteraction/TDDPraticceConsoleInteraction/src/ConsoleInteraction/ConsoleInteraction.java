package ConsoleInteraction;

// reference
//part 1 : https://www.youtube.com/watch?v=TO5ZsXUP9Mk
//part 2 : https://www.youtube.com/watch?v=4Zh4IPwV8fQ
public class ConsoleInteraction {
    private int a;
    private int b;
    private State state = new InitialState(this);

    public String print() {
        return this.state.print();
    }

    public void input(String answer) {
        this.state.input(answer);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setState(State state) {
        this.state = state;
    }
}
