package controller;

import model.Line;
import model.Point;
import view.inputView;

import java.util.Scanner;

public class lineController {

    private String getInput() {
        inputView.firstInputView();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public Line generateLine() {
        String input = getInput();
        try {
            Point pointA = new Point(getInput().split("-")[0]);
            Point pointB = new Point(getInput().split("-")[2]);
            Line line = new Line(pointA, pointB);
            return line;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateLine();
        }
    }
}
