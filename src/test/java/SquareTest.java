import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SquareTest {
    @Test
    public void 사각형넓이테스트() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Points points = new Points(input);
        Square square = new Square(points);
        System.out.println(points.get());
        System.out.println(square.getWidth());
    }

    @Test
    public void 사각형오류발생케이스테스트() {
        String input = "(10,11)-(22,10)-(22,18)-(10,18)";
        Points points = new Points(input);
        assertThatThrownBy(() -> new Square(points)).isInstanceOf(IllegalArgumentException.class);
    }
}
