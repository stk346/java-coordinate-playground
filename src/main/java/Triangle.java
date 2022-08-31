import java.util.ArrayList;

public class Triangle {
    Points points;
    Triangle(Points points) {
        this.points = points;
    }

    public double getWidth() {
        double a = getLineA().getWidth();
        double b = getLineB().getWidth();
        double c = getLineC().getWidth();
        double width = 0.25*(Math.sqrt(4*Math.pow(a,2)*Math.pow(b,2) - Math.pow(Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2), 2)));
        double rounded = Math.round(width)*10/10;
        return rounded;
    }
    private Line getLineA() {
        ArrayList<Point> LineCBList = new ArrayList<Point>();
        LineCBList.add(points.getC());
        LineCBList.add(points.getB());
        Points pointsCB = new Points(LineCBList);
        return new Line(pointsCB);
    }
    private Line getLineB() {
        ArrayList<Point> LineACList = new ArrayList<Point>();
        LineACList.add(points.getA());
        LineACList.add(points.getC());
        Points pointsAC = new Points(LineACList);
        return new Line(pointsAC);
    }
    private Line getLineC() {
        ArrayList<Point> LineABList = new ArrayList<Point>();
        LineABList.add(points.getA());
        LineABList.add(points.getB());
        Points pointsAB = new Points(LineABList);
        return new Line(pointsAB);
    }
}
