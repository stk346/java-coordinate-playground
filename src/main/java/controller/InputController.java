package controller;

import model.*;
import java.util.ArrayList;

public class InputController {
    private Points generatePoints(String[] separatedInput) {
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : separatedInput) {
            pointArray.add(new Point(s));
        }
        return new Points(pointArray);
    }

    public Figure getWidth(String input) {
        String[] pointArray = input.split("-");
            Points points = generatePoints(pointArray);
            return FigureFactory.createFigure(points);
    }
}
