package week2.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultipleTest {
    private Multiple Multiple;

    @BeforeEach
    void setUp() {
        Multiple = new Multiple();
    }

    @Test
    @DisplayName("5의 배수가 나와야한다.")
    void multiple() {
        assertThat(Multiple.multiple(5 ).isEqualTo(25);
    }
}
