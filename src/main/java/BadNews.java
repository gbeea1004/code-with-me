import java.util.Scanner;

public class BadNews {
    public static void main(String[] args) {
        int line = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("(1) 미드");
            System.out.println("(2) 탑");
            System.out.println("(3) 정글");
            System.out.println("(4) 원딜");
            System.out.println("(5) 서폿");
            System.out.print("희망하는 라인(1 ~ 5)을 선택하세요. (매칭 취소: 0)");

            String tmp = scanner.nextLine(); // 화면에서 입력받은내용을 tmp 로 저장.
            line = Integer.parseInt(tmp); // 입력받은 문자열 (tmp)을 숫자로 변환.

            if (line == 0) {
                System.out.println("매칭을 취소합니다.");
                break;

            } else if (!(1 <= line && line <= 5)) { // 1~5 외의 선택지는 아래와 같이 출력
                System.out.println("잘못 입력하셨습니다. 매칭 취소는 (0)");
                continue;
            }
            System.out.println("선택하신 라인은 " + line + "입니다.");
            break;
        }
    }
}
