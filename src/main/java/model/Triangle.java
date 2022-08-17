package model;

public class Triangle {
    Points points;
    public Triangle(Points points) {
        this.points = points;
    }

    public double getAB() {
        Line line = new Line(points.getA(), points.getB());
        double width = line.getLineWidth();
        return width;
    }
    public double getBC() {
        Line line = new Line(points.getB(), points.getC());
        double width = line.getLineWidth();
        return width;
    }
    public double getCA() {
        Line line = new Line(points.getC(), points.getA());
        double width = line.getLineWidth();
        return width;
    }

    public double getWidth() {
        double a = getAB();
        double b = getBC();
        double c = getCA();
        double triangleWidth = 0.25*Math.sqrt(4*Math.pow(a, 2)*Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2));
        return Math.round(triangleWidth*10)/10;
    }
}
