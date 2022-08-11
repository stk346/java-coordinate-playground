package model;

import validator.Validator;

import java.util.Scanner;

public class Line {
    Point pointA;
    Point pointB;
    public Line(String input) {
        this.pointA = new Point(input.split("-")[0]);
        this.pointB = new Point(input.split("-")[1]);
    }

    public double getLineWidth() {
        double Ax = Double.parseDouble(pointA.getX());
        double Ay = Double.parseDouble(pointA.getY());
        double Bx = Double.parseDouble(pointB.getX());
        double By = Double.parseDouble(pointB.getY());

        double lineWidth = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
        return lineWidth;
    }
}
