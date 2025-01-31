import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ConsoleInteractionTest {
    @Test
    void initial_and_print(){
        Module module = new Module();
        String printed = module.print();
        Assertions.assertEquals("C or R", printed);
    }

    @Test
    void initial_and_R(){
        Module module = new Module();
        module.input("R");
        String printed = module.print();
        Assertions.assertEquals("Rectangle side A length?", printed);
    }

    @Test
    void initial_and_A(){
        Module module = new Module();
        module.input("A");
        String printed = module.print();
        Assertions.assertEquals("C or R", printed);
    }

    @Test
    void initial_and_R_5(){
        Module module = new Module();
        module.input("R");
        module.input("5");
        String printed = module.print();
        Assertions.assertEquals("Rectangle side B length?", printed);
    }

    @Test
    void initial_and_R_6(){
        Module module = new Module();
        module.input("R");
        module.input("6");
        String printed = module.print();
        Assertions.assertEquals("Rectangle side B length?", printed);
    }

    @Test
    void initial_and_R_Z(){
        Module module = new Module();
        module.input("R");
        module.input("Z");
        String printed = module.print();
        Assertions.assertEquals("Rectangle side A length?", printed);
    }

    @Test
    void initial_and_R_5_10(){
        Module module = new Module();
        module.input("R");
        module.input("5");
        module.input("10");
        String printed = module.print();
        Assertions.assertEquals("Area=50, Circumference=30", printed);
    }

    @Test
    void initial_and_R_7_10(){
        Module module = new Module();
        module.input("R");
        module.input("7");
        module.input("10");
        String printed = module.print();
        Assertions.assertEquals("Area=70, Circumference=34", printed);
    }
}
