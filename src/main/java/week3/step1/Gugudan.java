package week3.step1;

public class Gugudan {
    private int[][] dans;

    public Gugudan() {
        dans = new int[10][10];
        calculate();
    }

    private void calculate() {
        // TODO: 이중 for 문으로 2차원 배열 안에 구구단 계산된 값을 넣는 코드를 작성한다.
        // TODO: 구현이 완료 된 후, test/java/week3/step1/GugudanTest 의 테스트코드를 통과해야한다.
        // ex) dans[2][3] = 6, dans[9][9] = 81

    }

    public int getValue(int x, int y) {
        return dans[x][y];
    }
}
