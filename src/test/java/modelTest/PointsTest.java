package modelTest;

import model.Point;
import model.Points;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PointsTest {
    @Test
    public void pointsSortTest() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        String[] inputArray = input.split("-");
        ArrayList<Point> pointArray = new ArrayList<Point>();
        for (String s : inputArray) {
            pointArray.add(new Point(s));
        }
        Points points = new Points(pointArray);
        System.out.println(points.getPoints());
    }
}
