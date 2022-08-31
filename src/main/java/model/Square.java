package model;

import java.util.ArrayList;

public class Square implements Figure{
    Points points;
    Square(Points points) throws IllegalArgumentException {
        this.points = points;
        if (points.getA().x != points.getB().x ||
            points.getA().y != points.getC().y ||
            points.getB().y != points.getD().y ||
            points.getC().x != points.getD().x) {
            throw new IllegalArgumentException("사다리꼴이나 마름모를 제외한 직사각형만 허용합니다.");
        }
    }

    public double getWidth() {
        return getAB() * getAC();
    }

    public void widthView() {
        System.out.println("사각형 넓이는 " + getWidth());
    }

    private double getAB() {
        ArrayList<Point> listAB = new ArrayList<>();
        listAB.add(this.points.getA());
        listAB.add(this.points.getB());
        Points pointsAB = new Points(listAB);
        Line line = new Line(pointsAB);
        return line.getWidth();
    }
    private double getAC() {
        ArrayList<Point> listAC = new ArrayList<>();
        listAC.add(this.points.getA());
        listAC.add(this.points.getC());
        Points pointsAC = new Points(listAC);
        Line line = new Line(pointsAC);
        return line.getWidth();
    }
}
