package l3classesobjects.oop;

public class CarImpl {
    public static void main(String[] args) {
        // create object of Car class
        Car car = new Car(true); // default (no-args) constructor
        System.out.println("Model Year : " + car.modelYear);
        System.out.println("Capacity : " + car.capacity);
        System.out.println("Color : " + car.color);
        car.color = "Blue";
        System.out.println("Color : " + car.color);
        System.out.println("hasManualTransmission ? : " + car.isManualTransmission);
        System.out.println("Last speed : " + car.accelerate(10));;
        System.out.println("Last speed : " + car.accelerate(50, 0.9));
        car.getCarColor();
    }
}
