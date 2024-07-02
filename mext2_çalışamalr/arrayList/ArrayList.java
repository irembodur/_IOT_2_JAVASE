package mext2_çalışamalr.arrayList;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new java.util.ArrayList<>();

        boolean exit = false;

        while(!exit){
            System.out.println("1- öğrenci ekle");
            System.out.println("2- öğrenci çıkar");
            System.out.println("3- öğrenci listesi");
            System.out.println("4- çıkış");
            System.out.println("seçiminiz: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("girmek istdiğiniz öğrenci ismini yaznız");
                    String name = scanner.nextLine();
                    students.add(name);
                    break;

                case 2:
                    System.out.println("listeden çıkarmak istediğiniz öğrenci indexini yaznız.");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    students.remove(index);
                    break;
                case 3:
                    for (String student : students){
                        System.out.println("öğrenci: " + student);
                    }
                    break;
                case 4:
                    exit = true;
                default:
                    System.out.println("geçersiz işlem!!!");


            }
        }


    }
}
