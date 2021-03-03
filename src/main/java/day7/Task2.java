package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rnd.nextInt(10)+90;
        }
        Player player1 = new Player(rnd.nextInt());
        Player player2 = new Player(rnd.nextInt());
        Player player3 = new Player(rnd.nextInt());
        Player player4 = new Player(rnd.nextInt());
        Player player5 = new Player(rnd.nextInt());
//        Player player6 = new Player(rnd.nextInt());

        for (int i = 0; i < 99; i++) {
            player5.run();

        }
        Player.info();

    }
}

