package week4.step1;

public class Step3 {
    public static void main(String[] args) {
        // TODO: 이중 for 문 익숙해지기 (아래 그림을 console 창에 출력하시오.)
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
