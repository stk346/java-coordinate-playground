package model;

import java.util.ArrayList;

public class Square {
    private static final String ONLY_RECTANGLE_MASSAGE = "직사각형만 연산이 가능합니다.";
    Points points;
    public Square(Points points) throws IllegalArgumentException{
        this.points = points;
    }

    private double getAB() {
        Line lineAB = new Line(this.points.getA(), this.points.getB());
        double width = lineAB.getLineWidth();
        return width;
    }
    private double getAC() {
        Line lineAD = new Line(this.points.getA(), this.points.getC());
        double width = lineAD.getLineWidth();
        return width;
    }

    public double getWidth() {
        double width = getAB() * getAC();
        return width;
    }
}
