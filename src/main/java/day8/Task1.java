package day8;

import javafx.beans.binding.StringBinding;

import java.lang.invoke.SwitchPoint;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string1 = "";
        for (int i = 0; i <= 20000; i++) {
            string1 += i + " ";

        } System.out.println(string1);


        long finish = System.currentTimeMillis();
        long TimeConsumedMills = finish - start;

        long start2 = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb1.append(i + " ");
        }
        System.out.println(sb1.toString());

        long finish2 = System.currentTimeMillis();
        long TimeConsumedMills2 = finish2 - start2;

        System.out.println(TimeConsumedMills);
        System.out.println(TimeConsumedMills2);


    }

}
