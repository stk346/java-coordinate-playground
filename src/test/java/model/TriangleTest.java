package model;

import model.Points;
import model.Triangle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleTest {
    @Test
    public void 삼각형넓이테스트() {
        String input = "(10,10)-(14,15)-(20,8)";
        Points points = new Points(input);
        Triangle triangle = new Triangle(points);
        System.out.println(triangle.getWidth());
    }
}
