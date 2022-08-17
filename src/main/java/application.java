import controller.InputController;
import model.Line;
import model.Points;

public class application {
    public static void main(String[] args) {
        InputController inputController = new InputController();
        System.out.println(inputController.getWidth());
    }
}
