import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3 ","Skyative3 ");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda3 ","Skyative3 ");
        System.out.println(Car.numberOfCars);
    }
}
