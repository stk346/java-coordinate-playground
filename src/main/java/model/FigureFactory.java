package model;

import java.util.HashMap;

public class FigureFactory {
    private static HashMap<Integer, FigureCreator> FIGURE_MAPPER = new HashMap<>();

    static {
        FIGURE_MAPPER.put(2, (points) -> new Line(points));
        FIGURE_MAPPER.put(3, (points) -> new Triangle(points));
        FIGURE_MAPPER.put(4, (points) -> new Square(points));
    }

    public Figure createFigure(Points points) {
        return FIGURE_MAPPER.get(points.size()).create(points);
    }
}
