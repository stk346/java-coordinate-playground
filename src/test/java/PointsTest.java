import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointsTest {
    @Test
    public void 생성테스트() {
        String input ="(10,10)-(14,15)";
        ArrayList<Point> tempArray = new ArrayList<>();
        for (String s : input.split("-")) {
            tempArray.add(new Point(s));
        }
        Points points = new Points(tempArray);
        assertThat(points.get()).isEqualTo("(10,10)-(14,15)");
    }
}
