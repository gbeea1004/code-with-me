package week4.step1;

import java.util.Random;
import java.util.Scanner;

public class CarRacing {
    public static void main(String[] args) {
        //선언문 먼저 기존 자바에 내장되어있는 도구 사용.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = scanner.nextInt(); //내가 입력한 인트값(carCount) 저장
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int tryCount = scanner.nextInt(); //내가 입력한 인트값(tryCount) 저장

        for (int i = 0; i < carCount; i++) {
            for (int j = 0; j < tryCount; j++) {
                if (random.nextInt(10) > 5) {
                    System.out.print("-");
                    //이중 포문을 이용하여 랜던값 0~9 사이의 수중 4이상이 나오면 한칸씩 이동하도록 설계.
                }
            }
            System.out.println();
        }
    }
}
