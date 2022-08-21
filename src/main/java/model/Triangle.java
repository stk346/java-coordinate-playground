package model;

public class Triangle implements Figure {
    Points points;
    public Triangle(Points points) {
        this.points = points;
    }

    public double getAB() {
        Line line = Line.of(points.get(0), points.get(1));
        double width = line.getWidth();
        return width;
    }
    public double getBC() {
        Line line = Line.of(points.get(1), points.get(2));
        double width = line.getWidth();
        return width;
    }
    public double getCA() {
        Line line = Line.of(points.get(2), points.get(0));
        double width = line.getWidth();
        return width;
    }

    public double getWidth() {
        double a = getAB();
        double b = getBC();
        double c = getCA();
        double triangleWidth = 0.25*Math.sqrt(4*Math.pow(a, 2)*Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2));
        return Math.round(triangleWidth*10)/10;
    }

    public String getResult() {
        return "삼각형 넓이는 %.2f";
    }
}
