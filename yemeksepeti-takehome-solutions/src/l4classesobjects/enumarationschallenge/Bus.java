package l4classesobjects.enumarationschallenge;

public class Bus {
    private Destination destinationOfBus;
    private Passenger[] passengers;
    private final int BUS_CAPACITY;
    private int insertedPassenger;

    public Bus(Destination destinationOfBus) {
        this.destinationOfBus = destinationOfBus;
        this.passengers = new Passenger[10];
        this.BUS_CAPACITY = 10;
        this.insertedPassenger = 0;
    }

    public void insertPassenger(Passenger passenger){
        if(insertedPassenger < this.BUS_CAPACITY){
            if(passenger.getDestination() == this.destinationOfBus) {
                passengers[insertedPassenger] = passenger;
                insertedPassenger++;

                System.out.println("---------------------");
                System.out.println("Passenger " + passenger.getName() + " is inserted to the bus...");
                System.out.println("Total passengers : " + insertedPassenger );
                System.out.println("Remained seats available : " + (this.BUS_CAPACITY - insertedPassenger));
                System.out.println("---------------------");

            } else {
                System.out.printf("Destination of bus is %s, but the passenger %s wants to go %s \n"
                        , this.destinationOfBus, passenger.getName(), passenger.getDestination());
            }
        } else {
            System.out.println("There is not enough seats for new passengers...");
        }
    }

    public Destination getDestinationOfBus() {
        return destinationOfBus;
    }

    public void setDestinationOfBus(Destination destinationOfBus) {
        this.destinationOfBus = destinationOfBus;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getBUS_CAPACITY() {
        return BUS_CAPACITY;
    }

    public int getInsertedPassenger() {
        return insertedPassenger;
    }

    public void setInsertedPassenger(int insertedPassenger) {
        this.insertedPassenger = insertedPassenger;
    }
}
