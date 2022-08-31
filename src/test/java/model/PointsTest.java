package model;

import model.Point;
import model.Points;
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

    @Test
    public void 정렬테스트() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        String[] inputArray = input.split("-");
        ArrayList<Point> pointList = new ArrayList<>();
        for (String s : inputArray) {
            pointList.add(new Point(s));
        }
        Points points = new Points(pointList);
//        assertThat(points.get()).isEqualTo("(10,10)-(10,18)-(22,10)-(22,18)");
        System.out.println(points.get());
    }

    @Test
    public void  좌표비교테스트() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Points points = new Points(input);
        assertThat(points.getA().x == points.getB().x);
    }
    @Test
    public void  ABCD제대로맞는지확인() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Points points = new Points(input);
        System.out.println(points.getA().get());
        System.out.println(points.getB().get());
        System.out.println(points.getC().get());
        System.out.println(points.getD().get());
    }
}
