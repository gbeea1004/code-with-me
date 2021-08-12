package week4.step1;

public class League {
    public static void main(String[] args) {
        Champion[] champions = Champion[3];
        champions[0] = new Zed("제드");
        champions[1] = new Rise("라이즈");
        champions[2] = new Leesin("리 신");

        for (int i = 0; i < Champiom.length; i++) {
            champions[i].make();

            if(champions[i] instanceof Zed) {

            }

        }
    }
}
