package l4classesobjects.enumerationchallenge2;

public class Floor {
    private int floorNo;
    private Flat[] flats;

    public Floor(int floorNo, Flat[] flats) {
        this.floorNo = floorNo;
        this.flats = flats;
    }

    public String getInfo() {
        String strFloor = "Floor no: " + floorNo + "\n";
        for (Flat flat : flats) {
            strFloor += flat.getInfo();
        }
        return strFloor;
    }

    public int getPrice() {
        int total = 0;
        for (Flat flat : flats) {
            total += flat.getPrice();
        }
        return total;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
