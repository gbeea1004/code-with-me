package week2.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week2.step1.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

public class GugudanTest {
    private Gugudan Gugudan;

    @BeforeEach
    void setUp() {
        Gugudan = new Gugudan();
    }

    @Test
    @DisplayName("두 수를 곱한 값이 나와야 한다.")
    void times() {
        assertThat(Gugudan.time(2, 1)).isEqualTo(2);
        assertThat(Gugudan.time(2, 2)).isEqualTo(4);
        assertThat(Gugudan.time(2, 3)).isEqualTo(6);
        assertThat(Gugudan.time(2, 4)).isEqualTo(8);
        assertThat(Gugudan.time(2, 5)).isEqualTo(10);
        assertThat(Gugudan.time(2, 6)).isEqualTo(12);
        assertThat(Gugudan.time(2, 7)).isEqualTo(14);
        assertThat(Gugudan.time(2, 8)).isEqualTo(16);
        assertThat(Gugudan.time(2, 9)).isEqualTo(18);
    }
}
