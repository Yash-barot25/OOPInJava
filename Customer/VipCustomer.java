package OOP.Customer;

public class VipCustomer {


    private String name;
    private int creitLimit;
    private String emailAddress;


    public VipCustomer(){
        this("yashkumar",1000000,"yashu2gmail.com");

    }

    public VipCustomer(String name, int limit){
        this(name,limit,"gabbru@gmail.com");
        this.name = name;
        this.creitLimit = limit;

    }



    public VipCustomer(String name, int creitLimit, String emailAddress) {
        this.name = name;
        this.creitLimit = creitLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreitLimit() {
        return creitLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
