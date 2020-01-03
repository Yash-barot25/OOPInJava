package OOP.Account;

import OOP.Account.Account;

public class Bank {


    public static void main(String[] args) {


        Account account = new Account("98425124","yash",0,"yash@gmail.com","6477812535");



        System.out.println(  account.getName());
        System.out.println(account.getNumber());
        System.out.println(account.getPhoneNumber());
        System.out.println(  account.getEmail());


        account.deposite(100);
        account.withdraw(50);
        System.out.println( account.getBalance());




    }

}
