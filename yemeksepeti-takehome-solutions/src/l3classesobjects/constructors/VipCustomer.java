package l3classesobjects.constructors;

public class VipCustomer {

    // name, credit limit, and email address
    String name;
    double creditLimit;
    String email;

    public VipCustomer(){
        this("Test Test" , 50000, "test@test.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email){
        this.name = name;
        this.email = email;
        this.creditLimit = 20000.56;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
