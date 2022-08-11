import model.Line;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LineTest {
    @Test
    public void splitTest() {
        String input = "(0,0)-(0,2)";
        Line line = new Line(input);

        double lineWidth = line.getLineWidth();
        System.out.println(lineWidth);
    }
}
