package view;

public class ResultView {
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
}
