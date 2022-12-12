package l4classesobjects.enumerationchallenge2;

public class BuildingConstuctor {
    public static void main(String[] args) {
        // Ground floor
        Flat studio1 = new Flat(1, 1, FlatType.STUDIO);
        Flat studio2 = new Flat(2, 1, FlatType.STUDIO);
        Flat studio3 = new Flat(3, 1, FlatType.STUDIO);
        Flat studio4 = new Flat(4, 1, FlatType.STUDIO);
        Flat studio5 = new Flat(5, 1, FlatType.STUDIO);

        Flat[] groundFloorFlats = {studio1, studio2, studio3, studio4, studio5};

        Floor groundFloor = new Floor(0, groundFloorFlats);

        // First floor
        Flat apartment1 = new Flat(6, 2, FlatType.APARTMENT);
        Flat apartment2 = new Flat(7, 2, FlatType.APARTMENT);
        Flat apartment3 = new Flat(8, 3, FlatType.APARTMENT);

        Flat[] firstFloorFlats = {apartment1, apartment2, apartment3};

        Floor firstFloor = new Floor(1, firstFloorFlats);

        // Second floor
        Flat rezidance1 = new Flat(9, 4, FlatType.REZIDENCE);
        Flat rezidance2 = new Flat(10, 4, FlatType.REZIDENCE);

        Flat[] secondFloorFlats = {rezidance1, rezidance2};

        Floor secondFloor = new Floor(2, secondFloorFlats);

        // constuct building
        Address address = new Address(12, "Istiklal Caddesi");

        Floor[] floors = {groundFloor, firstFloor, secondFloor};

        Building doganApartmani = new Building(address, floors);

        // print price and info
        System.out.println(doganApartmani.getInfo());
        System.out.println("-----------------");
        System.out.println("TOTAL PRICE : " + doganApartmani.getPrice());

    }
}
