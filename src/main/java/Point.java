import java.util.Comparator;
import java.util.Objects;
public class Point implements Comparable<Point>{
    int x;
    int y;

    Point(String input) throws IllegalArgumentException {
        this.x = Integer.parseInt(input.substring(input.indexOf('(') + 1, input.indexOf(',')));
        this.y = Integer.parseInt(input.substring(input.indexOf(',') + 1, input.indexOf(')')));
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24를 초과할 수 없습니다.");
        }
    }

    public String get() {
        return "(" + x + "," + y + ")";
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
