package l4classesobjects.enumarationschallenge;

public class TestBus {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Ali", Destination.ANKARA);
        Passenger passenger2 = new Passenger("Veli", Destination.ISTANBUL);
        Passenger passenger3 = new Passenger("Ramazan", Destination.ANKARA);
        Passenger passenger4 = new Passenger("Burcu", Destination.TRABZON);
        Passenger passenger5 = new Passenger("Kaan", Destination.ISTANBUL);
        Passenger passenger6 = new Passenger("Furkan", Destination.ANKARA);

        Bus bus = new Bus(Destination.ANKARA);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger2);
        bus.insertPassenger(passenger3);
        bus.insertPassenger(passenger4);
        bus.insertPassenger(passenger5);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger6);



    }
}
