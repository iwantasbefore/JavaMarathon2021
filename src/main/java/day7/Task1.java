package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("boieng", 1989,35,20000);
        Airplane airplane2 = new Airplane("airbus", 1989, 45, 200000);
        Airplane.compareAirplanes(airplane1,airplane2);



    }
}