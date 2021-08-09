package week4.step1;

public class Step7 {
    public static void main(String[] args) {
        // TODO: 이중 for 문 익숙해지기 (아래 그림을 console 창에 출력하시오.)
        //   *
        //  ***
        // *****
        //  ***
        //   *
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
