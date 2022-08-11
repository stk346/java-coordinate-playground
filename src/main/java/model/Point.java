package model;

public class Point {
    String positionX;
    String positionY;

    public Point(String input) throws IllegalArgumentException {
        this.positionX = input.split(",")[0].substring(1);
        String tempY = input.split(",")[1];
        this.positionY = input.split(",")[1].substring(0, tempY.length()-1);

        if (Integer.parseInt(positionX) > 24 | Integer.parseInt(positionY) > 24) {
            throw new IllegalArgumentException("최대 좌표는 24를 초과할 수 없습니다.");
        }
    }

    public String getX() {
        return positionX;
    }

    public String getY() {
        return positionY;
    }
}
