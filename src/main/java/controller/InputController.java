package controller;

import model.Figure;
import model.FigureFactory;
import model.Points;

public class InputController {
    String input;
    public InputController(String input) {
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

    public String returnWidth() {
        Figure figure = getFigure();
        return figure.widthView();
    }
}
