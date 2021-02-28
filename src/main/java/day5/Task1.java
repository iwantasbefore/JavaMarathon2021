package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Audi");
        car1.setColor("White");
        car1.setYear(2020);
        System.out.println("Model auto: "+car1.getModel());
        System.out.println("Color auto: "+car1.getColor());
        System.out.println("Year: "+car1.getYear());
    }
}
