package model;

import java.util.Collections;
import java.util.List;

public class Points {
    private static final String SHAPE_ERROR_MASSAGE = "좌표의 개수는 2-4개 이어야 합니다.";
    List<Point> points;

    public Points(List<Point> points) throws IllegalArgumentException {
        Collections.sort(points);
        this.points = points;
        if (points.size() == 1 || points.size() > 4) {
            throw new IllegalArgumentException(SHAPE_ERROR_MASSAGE);
        }
    }

    public String getPoints() {
        String tempString = "";
        for (Point point : points) {
            tempString += "(" + point.getX() + "," + point.getY() + ")" + "-";
        }
        return tempString;
    }

    public int size() {
        return this.points.size();
    }

    public Point get(final int index) {
        return this.points.get(index);
    }
}
