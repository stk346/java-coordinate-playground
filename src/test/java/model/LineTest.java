package model;

import model.Line;
import model.Points;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    public void 라인길이테스트() {
        String input = "(10,10)-(14,15)";
        Points points = new Points(input);
        Line line = new Line(points);
        System.out.println(line.getWidth());
    }
}
