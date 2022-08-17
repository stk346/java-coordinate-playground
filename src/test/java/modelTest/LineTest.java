package modelTest;

import controller.InputController;
import model.Line;
import model.Point;
import model.Points;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LineTest {
    @Test
    public void splitTest() {
        String input = "(0,0)-(0,2)";
        InputController inputController = new InputController();
        Points points = inputController.generatePoints();
        Line line = new Line(points.getA(), points.getB());

        double lineWidth = line.getLineWidth();
        System.out.println(lineWidth);
    }
}
