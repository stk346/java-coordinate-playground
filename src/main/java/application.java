import controller.lineController;
import model.Line;

public class application {
    public static void main(String[] args) {
        lineController lineController = new lineController();
        Line line = lineController.generateLine();
        System.out.println("두 점 사이의 거리는 " + line.getLineWidth());
    }
}
