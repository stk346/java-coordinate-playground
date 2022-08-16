package modelTest;

import model.Point;
import model.Points;
import model.Square;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SquareTest {
    @Test
    public void sortTest() {
        String userInput = "(10,10)-(22,10)-(22,18)-(10,18)";
        ArrayList<Point> pointArray = new ArrayList<>();
        String[] stringArray = userInput.split("-");
        for (String s : stringArray) {
            pointArray.add(new Point(s));
        }
        Points points = new Points(pointArray);
        Square square = new Square(points);
        System.out.println(square.getWidth());
    }
}
