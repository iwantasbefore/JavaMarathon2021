package day7;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;



    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +", вес: " + weight +", количество топлива в баке: " + fuel);
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }


    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length > airplane2.length)
            System.out.println("Первый самолёт длиннее");
        else if(airplane1.length < airplane2.length)
            System.out.println("Второй самолёт длиннее");
        else{
            System.out.println("Длины самолётов равны");
        }
    }

}
