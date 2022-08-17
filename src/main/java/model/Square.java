package model;

public class Square implements Figure {
    private static final String SQUARE_SHAPE_ERROR_MASSAGE = "직사각형의 네 각은 직각이어야 합니다.";
    Points points;
    public Square(Points points) throws IllegalArgumentException{
        this.points = points;
        if (points.getA().getX() != points.getB().getX() ||
            points.getA().getY() != points.getC().getY() ||
            points.getD().getX() != points.getC().getX() ||
            points.getD().getY() != points.getB().getY()) {
            throw new IllegalArgumentException(SQUARE_SHAPE_ERROR_MASSAGE);
        }
    }

    private double getAB() {
        Line lineAB = new Line(points.getA(), points.getB());
        double width = lineAB.getWidth();
        return width;
    }
    private double getAC() {
        Line lineAD = new Line(points.getA(), points.getC());
        double width = lineAD.getWidth();
        return width;
    }

    public double getWidth() {
        double width = getAB() * getAC();
        return width;
    }
}
