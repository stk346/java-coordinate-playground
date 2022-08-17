package modelTest;

import model.Point;
import model.Points;
import model.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TriangleTest {
    @Test
    public void widthCalculateTest() {
        double a = 6.40;
        double b = 9.21;
        double c = 10.19;
        double aPow = Math.pow(a, 2);
        double bPow = Math.pow(b, 2);
        double cPow = Math.pow(c, 2);

        System.out.println(0.25*Math.sqrt(4*Math.pow(a, 2)*Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2)));
    }

    @Test
    public void devideTest() {
        double a = 0.25;
        System.out.println(a);
    }

    @Test
    public void widthTest() {
        String input = "(10,10)-(14,15)-(20,8)";
        String[] inputArray = input.split("-");
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : inputArray) {
            pointArray.add(new Point(s));
        }
        Points points = new Points(pointArray);
        Triangle triangle = new Triangle(points);
        System.out.println(triangle.getWidth());
    }

    @Test
    public void twoPointTest() {
        String input = "(10,10)-(14,15)";
        String[] inputArray = input.split("-");
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : inputArray) {
            pointArray.add(new Point(s));
        }
        Points points = new Points(pointArray);
        Triangle triangle = new Triangle(points);
        System.out.println(triangle.getWidth());
    }
}
