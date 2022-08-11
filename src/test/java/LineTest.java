import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LineTest {
    @Test
    public void splitTest() {
        String input = "(10,10)-(14,15)";
        String A = Line.getA(input);
        String B = Line.getB(input);

        String Ax = Line.getX(A);
        String Ay = Line.getY(A);
        String Bx = Line.getX(B);
        String By = Line.getY(B);
        System.out.println(A + B);
        System.out.println(Ax + Ay + Bx + By);
    }

    @Test
    public void calculateTest() {
        Line line = new Line();
        String input = "(0,0)-(0,2)";
        double lineWidth = line.calculate(input);
        System.out.println(lineWidth);
    }
}
