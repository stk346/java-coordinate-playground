package model;

import model.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PointTest {
    @Test
    public void 포인트밸리대이션성공케이스() {
        String input = "(0,24)";
        Point point = new Point(input);
//        System.out.println(point.get());
        assertThat(point.get()).isEqualTo("(0,24)");
    }

    @Test
    public void 포인트밸리대이션실패케이스(){
        String input = "(24, 25)";
        assertThatThrownBy(() -> new Point(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 포인트출력테스트() {
        String input = "(1,1)";
        Point point = new Point(input);

        System.out.println(point.get());
    }
}
