public class Point {
    int x;
    int y;
    Point(String input) throws IllegalArgumentException {
        this.x = Integer.parseInt(input.substring(input.indexOf('(')+1, input.indexOf(',')));
        this.y = Integer.parseInt(input.substring(input.indexOf(',')+1, input.indexOf(')')));
        if (x > 24 || y > 24) {
            throw new IllegalArgumentException("좌표는 24를 초과할 수 없습니다.");
        }
    }

    public String get() {
        return "(" + x + "," + y + ")";
    }
}
