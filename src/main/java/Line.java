public class Line {
    Points points;
    Line(Points points) {
        this.points = points;
    }

    public double getWidth() {
        Point a = points.getA();
        int Ax = a.x;
        int Ay = a.y;
        Point b = points.getB();
        int Bx = b.x;
        int By = b.y;
        return Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
    }


}
