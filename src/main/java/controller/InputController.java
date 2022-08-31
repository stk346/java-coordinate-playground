package controller;

import model.Figure;
import model.FigureFactory;
import model.Points;

public class InputController {
    String input;
    InputController(String input) {
        this.input = input;
    }

    private Points getPoints() {
        Points points = new Points(input);
        return points;
    }

    private Figure getFigure() {
        Points points = getPoints();
        FigureFactory figureFactory = new FigureFactory();
        return figureFactory.createFigure(points);
    }

    public void returnWidth() {
        Figure figure = getFigure();
        figure.widthView();
    }
}
