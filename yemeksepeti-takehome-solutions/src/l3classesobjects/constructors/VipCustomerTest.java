package l3classesobjects.constructors;

public class VipCustomerTest {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer("Ayşe Türk", "ayse@turk.com");
        System.out.println(vipCustomer);
        vipCustomer = new VipCustomer();
        System.out.println(vipCustomer);
    }
}
