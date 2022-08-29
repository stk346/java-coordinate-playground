import java.util.ArrayList;
import java.util.Collections;

public class Points {
    ArrayList<Point> points;

    Points(ArrayList<Point> pointArray) {
        Collections.sort(pointArray);
        this.points = pointArray;
    }

    public String get() {
        String coordinateInformation = "";
        for (int i=0; i<points.size(); i++) {
            coordinateInformation += points.get(i).get() + "-";
        }
        return coordinateInformation.substring(0, coordinateInformation.length()-1);
    }
}
