package l3classesobjects.oop;

// blueprint
public class Car {

    // instance variables (fields, class members, değişken, alan vs...)
    // states
    public String color = "Black";
    int capacity = 10;
    protected double horsePower;
    String fuelType;
    boolean isManualTransmission;
    int modelYear;
    String modelName;

    // shadowing
    public Car(int capacity) {
        this.capacity = capacity;
        System.out.println("Capacity = " + capacity);
    }

    public Car(String color, int modelYear) {
        this.color = color;
        this.modelYear = modelYear;
    }

    public Car(){
        this("Brown", 2021);
    }

    public Car(boolean isManualTransmission){
        this("Brown", 2021);
        this.isManualTransmission = isManualTransmission;
    }

    public Car(String customColor, int mycapacity,  String fuelType, boolean isManualTransmission, int modelYear, String modelName) {
        customColor = "Yellow";
        color = customColor;
        capacity = mycapacity;
        this.horsePower = 165;
        this.fuelType = fuelType;
        this.isManualTransmission = isManualTransmission;
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public Car(String fuelType, boolean isManualTransmission, int modelYear) {
        this.fuelType = fuelType;
        this.isManualTransmission = isManualTransmission;
        this.modelYear = modelYear;
    }

    // methods
    // behaviors
    public int accelerate(int speed) {
        int currentSpeed = 0; // --> local variable
        currentSpeed += 10;
        double lastSpeed = 85.70; // --> local variable
        lastSpeed++;
        currentSpeed++;
        capacity--;
        return (int) lastSpeed + speed;
    }

    public int accelerate(int speed, double rate) {
        int currentSpeed = 0;
        currentSpeed += 10;
        fuelType = "";
        double lastSpeed = 85.70;
        return (int) ((lastSpeed + speed) * rate);
    }

    public void getCarColor(){
        accelerate(100);
        int a; // --> local variable
        System.out.println(color);
    }

   public Car getCarObject(){
        return new Car();
    }
}




