package l4classesobjects.enumerationchallenge2;

public class Building {
    private Address address;
    private Floor[] floors;

    public Building(Address address, Floor[] floors) {
        this.address = address;
        this.floors = floors;
    }

    public String getInfo() {
        String strFloor = "Building address: " + getAddress().getInfo() + "\n" ;
        for (Floor floor : floors) {
            strFloor += floor.getInfo();
        }
        return strFloor ;
    }

    public int getPrice() {
        int total = 0;
        for (Floor floor : floors) {
            total += floor.getPrice();
        }
        return total;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
