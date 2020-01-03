package OOP.Account;

public class Account {

    private String number;
    private String name;
    private int balance;
    private String email;
    private String phoneNumber;


    public Account(String number, String name, int balance, String email, String phoneNumber) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }


    public int getBalance() {
        return balance;
    }


    public String getEmail() {
        return email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void deposite(int amount) {

        if (amount <= 0) {
            System.out.println("Sorry the deposit amount is not valid");
        } else {

            this.balance += amount;

            System.out.println("The deposit of " + amount + " is successfully completed. The new balance is " + this.balance);

        }

    }

        public void withdraw(int amount) {

            if (amount > this.balance) {

                System.out.println("Withdraw  is not possible the requested amount is more then available fund:");

            } else {

                this.balance -= amount;

                System.out.println("withdraw of " + amount + " is completed. Current available balance is " + this.balance);

            }

        }


}
