package week3.step1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GugudanTest {
    private Gugudan gugudan;

    @BeforeEach
    void setUp() {
        gugudan = new Gugudan();
    }

    @Test
    @DisplayName("구구단 1단 체크")
    void gugudan1() {
        assertThat(gugudan.getValue(1, 1)).isEqualTo(1);
        assertThat(gugudan.getValue(1, 2)).isEqualTo(2);
        assertThat(gugudan.getValue(1, 3)).isEqualTo(3);
        assertThat(gugudan.getValue(1, 4)).isEqualTo(4);
        assertThat(gugudan.getValue(1, 5)).isEqualTo(5);
        assertThat(gugudan.getValue(1, 6)).isEqualTo(6);
        assertThat(gugudan.getValue(1, 7)).isEqualTo(7);
        assertThat(gugudan.getValue(1, 8)).isEqualTo(8);
        assertThat(gugudan.getValue(1, 9)).isEqualTo(9);
    }

    @Test
    @DisplayName("구구단 2단 체크")
    void gugudan2() {
        assertThat(gugudan.getValue(2, 1)).isEqualTo(2);
        assertThat(gugudan.getValue(2, 2)).isEqualTo(4);
        assertThat(gugudan.getValue(2, 3)).isEqualTo(6);
        assertThat(gugudan.getValue(2, 4)).isEqualTo(8);
        assertThat(gugudan.getValue(2, 5)).isEqualTo(10);
        assertThat(gugudan.getValue(2, 6)).isEqualTo(12);
        assertThat(gugudan.getValue(2, 7)).isEqualTo(14);
        assertThat(gugudan.getValue(2, 8)).isEqualTo(16);
        assertThat(gugudan.getValue(2, 9)).isEqualTo(18);
    }

    @Test
    @DisplayName("구구단 3단 체크")
    void gugudan3() {
        assertThat(gugudan.getValue(3, 1)).isEqualTo(3);
        assertThat(gugudan.getValue(3, 2)).isEqualTo(6);
        assertThat(gugudan.getValue(3, 3)).isEqualTo(9);
        assertThat(gugudan.getValue(3, 4)).isEqualTo(12);
        assertThat(gugudan.getValue(3, 5)).isEqualTo(15);
        assertThat(gugudan.getValue(3, 6)).isEqualTo(18);
        assertThat(gugudan.getValue(3, 7)).isEqualTo(21);
        assertThat(gugudan.getValue(3, 8)).isEqualTo(24);
        assertThat(gugudan.getValue(3, 9)).isEqualTo(27);
    }

    @Test
    @DisplayName("구구단 4단 체크")
    void gugudan4() {
        assertThat(gugudan.getValue(4, 1)).isEqualTo(4);
        assertThat(gugudan.getValue(4, 2)).isEqualTo(8);
        assertThat(gugudan.getValue(4, 3)).isEqualTo(12);
        assertThat(gugudan.getValue(4, 4)).isEqualTo(16);
        assertThat(gugudan.getValue(4, 5)).isEqualTo(20);
        assertThat(gugudan.getValue(4, 6)).isEqualTo(24);
        assertThat(gugudan.getValue(4, 7)).isEqualTo(28);
        assertThat(gugudan.getValue(4, 8)).isEqualTo(32);
        assertThat(gugudan.getValue(4, 9)).isEqualTo(36);
    }

    @Test
    @DisplayName("구구단 5단 체크")
    void gugudan5() {
        assertThat(gugudan.getValue(5, 1)).isEqualTo(5);
        assertThat(gugudan.getValue(5, 2)).isEqualTo(10);
        assertThat(gugudan.getValue(5, 3)).isEqualTo(15);
        assertThat(gugudan.getValue(5, 4)).isEqualTo(20);
        assertThat(gugudan.getValue(5, 5)).isEqualTo(25);
        assertThat(gugudan.getValue(5, 6)).isEqualTo(30);
        assertThat(gugudan.getValue(5, 7)).isEqualTo(35);
        assertThat(gugudan.getValue(5, 8)).isEqualTo(40);
        assertThat(gugudan.getValue(5, 9)).isEqualTo(45);
    }

    @Test
    @DisplayName("구구단 6단 체크")
    void gugudan6() {
        assertThat(gugudan.getValue(6, 1)).isEqualTo(6);
        assertThat(gugudan.getValue(6, 2)).isEqualTo(12);
        assertThat(gugudan.getValue(6, 3)).isEqualTo(18);
        assertThat(gugudan.getValue(6, 4)).isEqualTo(24);
        assertThat(gugudan.getValue(6, 5)).isEqualTo(30);
        assertThat(gugudan.getValue(6, 6)).isEqualTo(36);
        assertThat(gugudan.getValue(6, 7)).isEqualTo(42);
        assertThat(gugudan.getValue(6, 8)).isEqualTo(48);
        assertThat(gugudan.getValue(6, 9)).isEqualTo(54);
    }

    @Test
    @DisplayName("구구단 7단 체크")
    void gugudan7() {
        assertThat(gugudan.getValue(7, 1)).isEqualTo(7);
        assertThat(gugudan.getValue(7, 2)).isEqualTo(14);
        assertThat(gugudan.getValue(7, 3)).isEqualTo(21);
        assertThat(gugudan.getValue(7, 4)).isEqualTo(28);
        assertThat(gugudan.getValue(7, 5)).isEqualTo(35);
        assertThat(gugudan.getValue(7, 6)).isEqualTo(42);
        assertThat(gugudan.getValue(7, 7)).isEqualTo(49);
        assertThat(gugudan.getValue(7, 8)).isEqualTo(56);
        assertThat(gugudan.getValue(7, 9)).isEqualTo(63);
    }

    @Test
    @DisplayName("구구단 8단 체크")
    void gugudan8() {
        assertThat(gugudan.getValue(8, 1)).isEqualTo(8);
        assertThat(gugudan.getValue(8, 2)).isEqualTo(16);
        assertThat(gugudan.getValue(8, 3)).isEqualTo(24);
        assertThat(gugudan.getValue(8, 4)).isEqualTo(32);
        assertThat(gugudan.getValue(8, 5)).isEqualTo(40);
        assertThat(gugudan.getValue(8, 6)).isEqualTo(48);
        assertThat(gugudan.getValue(8, 7)).isEqualTo(56);
        assertThat(gugudan.getValue(8, 8)).isEqualTo(64);
        assertThat(gugudan.getValue(8, 9)).isEqualTo(72);
    }

    @Test
    @DisplayName("구구단 9단 체크")
    void gugudan9() {
        assertThat(gugudan.getValue(9, 1)).isEqualTo(9);
        assertThat(gugudan.getValue(9, 2)).isEqualTo(18);
        assertThat(gugudan.getValue(9, 3)).isEqualTo(27);
        assertThat(gugudan.getValue(9, 4)).isEqualTo(36);
        assertThat(gugudan.getValue(9, 5)).isEqualTo(45);
        assertThat(gugudan.getValue(9, 6)).isEqualTo(54);
        assertThat(gugudan.getValue(9, 7)).isEqualTo(63);
        assertThat(gugudan.getValue(9, 8)).isEqualTo(72);
        assertThat(gugudan.getValue(9, 9)).isEqualTo(81);
    }
}