package mext2_çalışamalr.bank;

public class Bank {

    private int customerNumber;
    private double balance;

    public Bank(int customerNumber, double balance){
        this.customerNumber = customerNumber;
        this.balance= balance;
    }

    public double getBalance(){
        return  balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void  deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

}
