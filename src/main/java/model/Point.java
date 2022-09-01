package model;

import java.util.Objects;
public class Point implements Comparable<Point>{
    int x;
    int y;

    Point(String input) throws IllegalArgumentException {
        this.x = getX(input);
        this.y = getY(input);
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24를 초과할 수 없습니다.");
        }
    }

    public String get() {
        return "(" + x + "," + y + ")";
    }
    private int getY(String input) throws IllegalArgumentException, StringIndexOutOfBoundsException {
        String extractedY = "";
        try {
            extractedY = input.substring(input.indexOf(',') + 1, input.indexOf(')'));
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("올바른 좌표 형식을 입력해 주세요.");
        }
        if (!extractedY.matches("[+-]?\\d*(\\.\\d+)?")) { //  숫자인지 판별
            throw new IllegalArgumentException("좌표는 오직 숫자이어야 합니다.");
        }
        return Integer.parseInt(extractedY);
    }

    private int getX(String input) throws IllegalArgumentException, StringIndexOutOfBoundsException {
        String extractedX = "";
        try {
            extractedX = input.substring(input.indexOf('(') + 1, input.indexOf(','));
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException("올바른 좌표 형식을 입력해 주세요.");
        }

        if (!extractedX.matches("[+-]?\\d*(\\.\\d+)?")) { //  숫자인지 판별
            throw new IllegalArgumentException("좌표는 오직 숫자이어야 합니다.");
        }
        return Integer.parseInt(extractedX);
    }
    @Override
    public int compareTo(Point o) {
        if (x == o.x) {
            return y - o.y;
        }
        return x - o.x;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
