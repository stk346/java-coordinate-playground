import java.util.ArrayList;
import java.util.Collections;

public class Points {
    ArrayList<Point> points;

    Points(ArrayList<Point> pointArray) {
        Collections.sort(pointArray);
        this.points = pointArray;
    }

    // 테스트용 생성자
    Points(String input) {
        String[] inputArray = input.split("-");
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : inputArray) {
            pointArray.add(new Point(s));
        }
        this.points = pointArray;
    }

    public String get() {
        String coordinateInformation = "";
        for (int i=0; i<points.size(); i++) {
            coordinateInformation += points.get(i).get() + "-";
        }
        return coordinateInformation.substring(0, coordinateInformation.length()-1);
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
