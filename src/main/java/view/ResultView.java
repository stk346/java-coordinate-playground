package view;

import model.Figure;
import model.Line;
import model.Square;
import model.Triangle;

public class ResultView{
    private static final String LINE_RESULT_MASSAGE = "두 점 사이 거리는 ";
    private static final String SQUARE_RESULT_MASSAGE = "사각형 넓이는 ";
    private static final String TRIANGLE_RESULT_MASSAGE = "삼각형 넓이는 ";

    public static String lineResultView() {
        return LINE_RESULT_MASSAGE;
    }

    public static String squareResultView() {
        return SQUARE_RESULT_MASSAGE;
    }

    public static String triangleResultView() {
        return TRIANGLE_RESULT_MASSAGE;
    }

    public static void getWidth(Line line) {
        System.out.println(LINE_RESULT_MASSAGE);
    }
    public static void getWidth(Square square) {
        System.out.println(SQUARE_RESULT_MASSAGE);
    }
    public static void getWidth(Triangle triangle) {
        System.out.println(TRIANGLE_RESULT_MASSAGE);
    }

    public static void showResult(Figure figure) {
        System.out.printf(figure.getResult(), figure.getWidth());
    }

}
