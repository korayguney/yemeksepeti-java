package l4classesobjects.enumerationchallenge2;

public class Address {
    private int no;
    private String street;

    public Address(int no, String street) {
        this.no = no;
        this.street = street;
    }

    // custom method
    public String getInfo() {
        return String.format("Address no: %d, street : %s \n", getNo(), getStreet());
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
