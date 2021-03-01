package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2010);
        car.setColor("Red");
        car.setModel("Audi");
        car.info();
        Motorbike motorbike = new Motorbike(1989, "red", "java" );
        motorbike.info();
        int year1 =  car.yearDifference(2020);
        int year2 = motorbike.yearDifference(2020);
        System.out.println("Разница в годах у мотоцикла "+ year2);
        System.out.println("Разница в годах у авто " + year1);




    }
}
