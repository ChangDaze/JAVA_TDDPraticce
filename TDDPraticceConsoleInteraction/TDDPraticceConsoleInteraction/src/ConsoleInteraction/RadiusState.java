package ConsoleInteraction;

import java.math.BigDecimal;

public class RadiusState implements State {
    private final ConsoleInteraction consoleInteraction;
    private final int r;
    private final BigDecimal pi = new BigDecimal("3.14");

    public RadiusState(ConsoleInteraction consoleInteraction, int r) {
        this.consoleInteraction = consoleInteraction;
        this.r = r;
    }

    @Override
    public String print() {
        return "Area=" + (pi.multiply(BigDecimal.valueOf(r * r))) + ", Circumference=" + (pi.multiply(BigDecimal.valueOf(2 * r)));
    }

    @Override
    public void input(String answer) {
        //do nothing
    }
}
