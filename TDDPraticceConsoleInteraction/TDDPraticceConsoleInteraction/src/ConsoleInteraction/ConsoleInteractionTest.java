package ConsoleInteraction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConsoleInteractionTest {
    @Test
    void initial_and_print(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        String printed = consoleInteraction.print();
        Assertions.assertEquals("C or R", printed);
    }

    @Test
    void initial_and_R(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Rectangle side A length?", printed);
    }

    @Test
    void initial_and_A(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("A");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("C or R", printed);
    }

    @Test
    void initial_and_R_5(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        consoleInteraction.input("5");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Rectangle side B length?", printed);
    }

    @Test
    void initial_and_R_6(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        consoleInteraction.input("6");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Rectangle side B length?", printed);
    }

    @Test
    void initial_and_R_Z(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        consoleInteraction.input("Z");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Rectangle side A length?", printed);
    }

    @Test
    void initial_and_R_5_10(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        consoleInteraction.input("5");
        consoleInteraction.input("10");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Area=50, Circumference=30", printed);
    }

    @Test
    void initial_and_R_7_10(){
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        consoleInteraction.input("R");
        consoleInteraction.input("7");
        consoleInteraction.input("10");
        String printed = consoleInteraction.print();
        Assertions.assertEquals("Area=70, Circumference=34", printed);
    }
}
