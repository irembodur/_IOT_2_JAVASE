package mext2_çalışamalr.bank;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank account1 = new Bank(152345, 500000);


        boolean exit = false;
        while (!exit) {
            System.out.println("1-deposit, 2-withdraw, 3-bakiye, 4- exit");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("yatırmak istediğiniz tutarı girin.");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account1.deposit(amount);
                    break;
                case 2:
                    System.out.println("çekmek istediğiniz tutarı giriniz.");
                    double amount2 = scanner.nextDouble();
                    scanner.nextLine();
                    account1.withdraw(amount2);
                    break;
                case 3:
                    double balance = account1.getBalance();
                    System.out.println("bakiye: " +balance);
                    break;
                case 4 :
                    exit = true;
                    System.out.println("çıkış yapıldı.");
                default:
                    System.out.println("geçersiz işlem!!!");
            }
        }
    }
}
