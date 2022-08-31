package controller;

import org.junit.jupiter.api.Test;

public class InputControllerTest {
    @Test
    public void 라인길이구하기() {
        String input = "(10,10)-(14,15)";
        InputController inputController = new InputController(input);
        inputController.returnWidth();
    }
    @Test
    public void 삼각형면적구하기() {
        String input = "(10,10)-(14,15)-(20,8)";
        InputController inputController = new InputController(input);
        inputController.returnWidth();
    }
    @Test
    public void 사각형면적구하기() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        InputController inputController = new InputController(input);
        inputController.returnWidth();
    }

}
