package week2.step2;

public class Multiple {
    // TODO : 5의 배수를 출력하는 메서드를 작성한다. 단 10배수 까지만.
    public int multiple(int a) {
        for (int i = 5; i < 51; i += 5) {
            System.out.println(i);
        }
        return a * 5;
    }
}