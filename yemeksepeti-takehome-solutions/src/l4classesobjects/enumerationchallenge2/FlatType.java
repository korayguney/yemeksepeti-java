package l4classesobjects.enumerationchallenge2;

public enum FlatType {
    STUDIO(20000),
    APARTMENT(35000),
    REZIDENCE(55000);

    private int price;

    FlatType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
