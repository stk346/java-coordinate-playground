package controller;

import model.*;
import view.inputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.Scanner;

public class InputController {
    ResultView resultView = new ResultView();

    public String getInput() {
        inputView.firstInputView();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public Points generatePoints() {
        String input = getInput();
        String[] separatedInput = input.split("-");
        ArrayList<Point> pointArray = new ArrayList<>();
        for (String s : separatedInput) {
            pointArray.add(new Point(s));
        }
        return new Points(pointArray);
    }

    public String getWidth() {
        try {
            Points points = generatePoints();
            if (points.size() == 2) {
                Line line = new Line(points.getA(), points.getB());
                return resultView.lineResultView() + line.getLineWidth();
            }
            if (points.size() == 3) {
                Triangle triangle = new Triangle(points);
                return resultView.triangleResultView() + triangle.getWidth();
            }
            Square square = new Square(points);
            return resultView.squareResultView() + square.getWidth();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getWidth();
        }
    }
}
