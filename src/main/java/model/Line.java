package model;

import java.util.ArrayList;
import java.util.List;

public class Line implements Figure {
    private final Points points;

    public Line(final Points points) {
        this.points = points;
    }

    public static Line of(Point pointA, Point pointB) {
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        return new Line(new Points(points));
    }

    public double getWidth() {
        int Ax = points.get(0).getX();
        int Bx = points.get(1).getX();
        int Ay = points.get(0).getY();
        int By = points.get(1).getY();

        return Math.sqrt((Math.pow(Ax - Bx, 2) + (Math.pow(Ay - By, 2))));
    }

    public String getResult() {
        return "두 점 사이의 거리는 %.2f";
    }
}
