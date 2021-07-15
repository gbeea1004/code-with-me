package week2.step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("두 수를 합한 값이 나와야 한다.")
    void plus() {
        assertThat(calculator.plus(1, 2)).isEqualTo(3);
        assertThat(calculator.plus(10, 20)).isEqualTo(30);
        assertThat(calculator.plus(100, 40)).isEqualTo(140);
        assertThat(calculator.plus(1000, 0)).isEqualTo(1000);
    }

    @Test
    @DisplayName("두 수를 뺀 값이 나와야 한다.")
    void minus() {
        assertThat(calculator.minus(1, 2)).isEqualTo(-1);
        assertThat(calculator.minus(100, 100)).isEqualTo(0);
        assertThat(calculator.minus(50, 40)).isEqualTo(10);
        assertThat(calculator.minus(24, 3)).isEqualTo(21);
    }

    @Test
    @DisplayName("두 수를 곱한 값이 나와야 한다.")
    void times() {
        assertThat(calculator.times(1, 2)).isEqualTo(2);
        assertThat(calculator.times(2, 5)).isEqualTo(10);
        assertThat(calculator.times(9, 9)).isEqualTo(81);
    }

    @Test
    @DisplayName("두 수를 나눈 값이 나와야 한다.")
    void divide() {
        assertThat(calculator.divide(10, 2)).isEqualTo(5);
        assertThat(calculator.divide(100, 5)).isEqualTo(20);
        assertThat(calculator.divide(9, 9)).isEqualTo(1);
    }
}