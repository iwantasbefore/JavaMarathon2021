package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus",1989,35 ,20000);
        airplane.fillUp(100);
        airplane.info();
        Airplane airplane2 =  new Airplane("Airbus",1995,50,2000);
        airplane.fillUp(150);
        airplane.fillUp(130);
        airplane.info();








    }
}
