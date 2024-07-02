package mext2_çalışamalr.spotify;

import java.util.Scanner;

public class SpotifyManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        spotify favoriteMusic = new spotify();

        boolean exit = false;
        while (!exit) {
            System.out.println("1 ekle, 2-çıkar, 3-liste, 4-çıkış");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("şarkı adını giriniz.");
                    String name = scanner.nextLine();
                    favoriteMusic.addMusic(name);
                    break;
                case 2:
                    System.out.println("çıkarmak istediğiniz şarkının indexini giriniz.");
                    int index = scanner.nextInt();
                    favoriteMusic.removeMusic(index);
                    break;
                case 3:
                    System.out.println("favori şarkılar listesi");
                    favoriteMusic.listMusics();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("geçersiz işlem girdiniz!!!");
            }


        }
    }
}
