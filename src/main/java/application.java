import controller.InputController;
import model.Figure;
import view.InputView;
import view.ResultView;

public class application {

    public static Figure calculate() {
        try {
        String input = InputView.getInput();
        InputController inputController = new InputController();
        return inputController.getWidth(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return calculate();
        }
    }
    public static void main(String[] args) {
        Figure figure = calculate();
        ResultView.showResult(figure);
    }
}
