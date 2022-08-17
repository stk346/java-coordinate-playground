package model;

public class Line {
    Point pointA;
    Point pointB;
    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double getLineWidth() {
        int Ax = pointA.getX();
        int Ay = pointA.getY();
        int Bx = pointB.getX();
        int By = pointB.getY();

        double lineWidth = Math.sqrt((Math.pow(Ax - Bx, 2) + (Math.pow(Ay - By, 2))));
        return lineWidth;
    }
}
