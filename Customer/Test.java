package OOP.Customer;

public class Test {

    public static void main(String[] args) {

        VipCustomer yashu01 = new VipCustomer();
        System.out.println(yashu01.getName());
        System.out.println(yashu01.getCreitLimit());
        System.out.println(yashu01.getEmailAddress());

        System.out.println("****************&^%$#$%^&*(*&^%$#$%^&***********************");

        VipCustomer yashu02 = new VipCustomer("gabbru",35000000);
        System.out.println(yashu02.getName());
        System.out.println(yashu02.getCreitLimit());
        System.out.println(yashu02.getEmailAddress());

        System.out.println("****************&^%$#$%^*(*&^%$#$%^&***********************");

        VipCustomer yashu03 = new VipCustomer("javan",5000000,"yashu@gmail.com");
        System.out.println(yashu03.getName());
        System.out.println(yashu03.getCreitLimit());
        System.out.println(yashu03.getEmailAddress());



    }

}
