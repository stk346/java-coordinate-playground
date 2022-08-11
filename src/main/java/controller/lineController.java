package controller;

import model.Line;
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
        try {
            String input = getInput();
            Line line = new Line(input);
            return line;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateLine();
        }
    }
}
