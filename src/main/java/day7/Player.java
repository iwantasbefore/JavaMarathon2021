package day7;

import com.sun.scenario.effect.impl.sw.java.JSWBoxShadowPeer;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.print("Команды неполные. " + "На поле еще есть " + (6 - countPlayers));
        }

        switch (6 - countPlayers) {
            case 1:
                System.out.println(" свободное место");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(" свободных места");
                break;
            case 5:
            case 6:
                System.out.println(" свободных мест");
                break;
            default:
                System.out.println(" свободных мест нет");


        }
    }


}
