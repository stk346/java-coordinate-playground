package model;

import java.util.*;

public class Points {
    private static final String SHAPE_ERROR_MASSAGE = "좌표의 개수는 2-4개 이어야 합니다.";
    ArrayList<Point> points;

    public Points(ArrayList<Point> points) throws IllegalArgumentException {
        Collections.sort(points);
        this.points = points;
        if (points.size() == 1 || points.size() > 4) {
            throw new IllegalArgumentException(SHAPE_ERROR_MASSAGE);
        }
    }

    public String getPoints() {
        String tempString = "";
        for (Point point : points) {
            tempString += "("+point.getX()+","+point.getY()+")"+"-";
        }
        return tempString;
    }

    public int size() {
        return this.points.size();
    }
    public Point getA() {
        return this.points.get(0);
    }
    public Point getB() {
        return this.points.get(1);
    }
    public Point getC() {
        return this.points.get(2);
    }
    public Point getD() {
        return this.points.get(3);
    }
}
