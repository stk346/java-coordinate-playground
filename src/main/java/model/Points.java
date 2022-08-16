package model;

import java.util.*;

public class Points {
    ArrayList<Point> points;

    public Points(ArrayList<Point> points) {
        Collections.sort(points);
        this.points = points;
    }

    public String getPoints() {
        String tempString = "";
        for (Point point : points) {
            tempString += "("+point.getX()+","+point.getY()+")"+"-";
        }
        return tempString;
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
