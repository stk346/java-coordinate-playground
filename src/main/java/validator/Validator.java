package validator;

public class Validator {
    public static final String VALIDATE_POINT_LENGTH_MASSAGE = "좌표의 길이는 24를 초과할 수 없습니다.";
    public static void validatePointLength(int point) {
        if (point > 24) {
            throw new IllegalArgumentException(VALIDATE_POINT_LENGTH_MASSAGE);}
    }
}
