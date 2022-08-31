import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class ValidationTest {
    @Test
    public void 좌표는숫자테스트() {
        String input = "(a,b)";
        assertThatThrownBy(() -> new Points(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 좌표개수테스트() {
        String input = "(1,1)";
        assertThatThrownBy(() -> new Points(input)).isInstanceOf(IllegalArgumentException.class);

    }
}
