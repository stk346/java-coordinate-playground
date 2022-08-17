package model;

import java.util.Objects;

public class Point implements Comparable<Point> {
    int positionX;
    int positionY;

    public Point(String input) throws IllegalArgumentException {
        this.positionX = Integer.parseInt(input.split(",")[0].substring(1));
        String tempY = input.split(",")[1];
        this.positionY = Integer.parseInt(input.split(",")[1].substring(0, tempY.length()-1));

        if ((positionX < 0 | positionX > 24) | (positionY < 0 | positionY > 24)) {
            throw new IllegalArgumentException("최대 좌표는 24를 초과할 수 없습니다.");
        }
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(positionX, point.positionX) && Objects.equals(positionY, point.positionY);
    }

    @Override
    public int compareTo(Point o) {
        if (positionX == o.positionX) {
            return positionY - o.positionY;
        }
        return positionX - o.positionX;
    }
}
