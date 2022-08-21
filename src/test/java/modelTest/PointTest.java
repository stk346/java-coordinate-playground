package modelTest;

import model.Point;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void 성공케이스() {
        String input = "(24,24)";
        Point point = new Point(input);
        System.out.println(String.valueOf(point.getX()) + "," + String.valueOf(point.getY()));
    }

    @Test
    public void 실패케이스() throws IllegalArgumentException {
        try{
            String input = "(25,24)";
            Point point = new Point(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}