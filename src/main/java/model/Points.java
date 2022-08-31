package model;

import java.util.ArrayList;
import java.util.Collections;

public class Points {
    ArrayList<Point> points;

    Points(ArrayList<Point> pointArray) {
        Collections.sort(pointArray);
        this.points = pointArray;
    }

    // 테스트용 생성자
    Points(String input) throws IllegalArgumentException {
        String[] inputArray = getStrings(input);
        ArrayList<Point> pointArray = getPoints(inputArray);
        if (pointArray.size() < 2 || pointArray.size() > 4) {
            throw new IllegalArgumentException("좌표는 두개 이상, 4개 이하이어야 합니다.");
        }
        this.points = pointArray;
    }

    private ArrayList<Point> getPoints(String[] inputArray) {
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : inputArray) {
            pointArray.add(new Point(s));
        }
        Collections.sort(pointArray);
        return pointArray;
    }

    private String[] getStrings(String input) {
        String[] inputArray = input.split("-");
        return inputArray;
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
    
    public int size() {
        return points.size();
    }
}
