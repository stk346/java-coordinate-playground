package modelTest;

import model.Line;
import model.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LineTest {
    @Test
    public void splitTest() {
        String input = "(0,0)-(0,2)";
        Point pointA = new Point(input.split("-")[0]);
        Point pointB = new Point(input.split("-")[1]);
        Line line = new Line(pointA, pointB);

        double lineWidth = line.getLineWidth();
        System.out.println(lineWidth);
    }
}
