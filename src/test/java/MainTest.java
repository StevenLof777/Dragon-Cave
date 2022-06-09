import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest{
    Main main;

    @Test
    void InputTestCaveChoiceOne(){
        assertEquals("The dragon has given you treasure", main.input(2));
    }

    @Test
    void InputTestCaveChoiceTwo(){
        assertEquals("The dragon has eaten you", main.input(1));
    }

    @Test
    void InputTestWrongChoice(){
        assertNotEquals("The dragon has eaten you", main.input(2));
    }
}

