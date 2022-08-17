package controller;

import model.*;
import view.ResultView;
import view.InputView;

import java.util.ArrayList;
import java.util.Scanner;

public class InputController {

    public String getInput() {
        InputView.firstInputView();
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
                return ResultView.lineResultView() + line.getWidth();
            }
            if (points.size() == 3) {
                Triangle triangle = new Triangle(points);
                return ResultView.triangleResultView() + triangle.getWidth();
            }
            Square square = new Square(points);
            return ResultView.squareResultView() + square.getWidth();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getWidth();
        }
    }
}
