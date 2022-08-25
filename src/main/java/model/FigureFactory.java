package model;

import java.util.HashMap;

public class FigureFactory {
    private static HashMap<Integer, FigureCreator> FIGURE_MAPPER = new HashMap<>();

    static {
        FIGURE_MAPPER.put(2, Line::new);
        FIGURE_MAPPER.put(3, Triangle::new);
        FIGURE_MAPPER.put(4, Square::new);
    }

    public static Figure createFigure(final Points points) {
        return FIGURE_MAPPER.get(points.size()).create(points);
    }
}
