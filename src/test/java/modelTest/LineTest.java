package modelTest;

import controller.InputController;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    public void splitTest() {
        String input = "(0,0)-(0,2)";
        InputController inputController = new InputController();
        System.out.println(inputController.getWidth(input));
    }
}
