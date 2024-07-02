package mext2_çalışamalr.users;

import mext2_kutuphaneyonetimi.User;

import java.util.Scanner;

public class UserManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while(!exit){

            System.out.println("yapmak istediğiniz işlemi seçin. 1- register, 2-şifre değiştir, 3- isim değiştir, 4-profil bilgileri, 5- çıkış");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation){
                case 1:
                    System.out.println("kullanıcı adınız ");
                    String  userName = scanner.nextLine();
                    System.out.println("şifre");
                    String password = scanner.nextLine();
                    System.out.println("Adınız ");
                    String name = scanner.nextLine();
                    System.out.println("yaşınız");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    User user = new User(userName,password,name,age);
                    System.out.println(user.userName);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("geçersiz bir işlem");
            }
        }
    }
}
