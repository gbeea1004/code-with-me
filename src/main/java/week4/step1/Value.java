package week4.step1;

public class Value {
    public static void main(String[] args) {
        int sum = 0; // 총점 변수의 초기화
        float average = 0f; // 평균 변수의 초기화 (소수점으로 표기해야하니 float 사용)

        int[] scores = {80, 41, 22, 70, 12}; // 5개의 인덱스 생성

        /*for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 반복문을 사용하여 배열에 저장되어 있는 값을 모두 더함.
        } */
        for (int score : scores) {
            sum += score;
        }
        average = sum / (float)scores.length; // 계산결과를 float로 얻기위해 형변환.

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
        }
    }
