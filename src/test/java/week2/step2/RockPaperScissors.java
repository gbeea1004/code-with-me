package week2.step2;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rockPaperScissors = true;
        while (rockPaperScissors) {
            System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
            int user = Integer .parseInt(scanner.nextLine()); //유저의 입력값 저장
            int com = (int) (Math.random() * 3) + 1; //1,2,3중 하나가 임의로 저장
            if (user >= 4 || user <=0) {
                System.out.println("번호를 잘못 입력하셨습니다! 다시 입력하세요^^");
                continue;
            }

            System.out.println("당신은" + user + "입니다.");
            System.out.println("상대는" + com + "입니다.");

            switch (user - com) {
                case 2:
                case -1:
                    System.out.println("당신이 졌습니다.");
                    break;
                case 1:
                case -2:
                    System.out.println("당신이 이겼습니다.");
                    break;
                case 0:
                    System.out.println("비겼습니다.");
                  //  break;    //마지막 문장이므로 break 사용 필요없.


            }
            System.out.println("재도전 하시겠습니까? (네 : Y or y, 아니오 : n or N)");
            String finish = scanner.nextLine();
            if (finish .equals("n") || finish . equals("N"))  {
                rockPaperScissors = false;
            }
        }
    }
}
