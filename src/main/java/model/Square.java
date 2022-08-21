package model;

import java.util.ArrayList;
import java.util.List;

public class Square implements Figure {
    private static final String SQUARE_SHAPE_ERROR_MASSAGE = "직사각형의 네 각은 직각이어야 합니다.";
    Points points;
    public Square(Points points) throws IllegalArgumentException{
        this.points = points;
        if (points.get(0).getX() != points.get(1).getX() ||
            points.get(0).getY() != points.get(2).getY() ||
            points.get(3).getX() != points.get(2).getX() ||
            points.get(3).getY() != points.get(1).getY()) {
            throw new IllegalArgumentException(SQUARE_SHAPE_ERROR_MASSAGE);
        }
    }

    private double getAB() {
        Line lineAB = Line.of(points.get(0),points.get(1));
        return lineAB.getWidth();
    }
    private double getAC() {
        Line lineAC = Line.of(points.get(0), points.get(2));
        return lineAC.getWidth();
    }

    public double getWidth() {
        return getAB() * getAC();
    }

    public String getResult() {
        return "사각형 넓이는 %.2f";
    }
}
