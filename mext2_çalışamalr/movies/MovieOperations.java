package mext2_çalışamalr.movies;

import java.util.Scanner;

public class MovieOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FavoriteMovie fMovie = new FavoriteMovie();

        boolean exit = false;
        while (!exit) {

            System.out.println("1 ekle, 2-çıkar, 3-liste, 4-çıkış");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("film adını giriniz.");
                    String name = scanner.nextLine();
                    fMovie.addMovie(name);
                    break;
                case 2:
                    System.out.println("çıkarmak istediğiniz filmin indexini giriniz.");
                    int index = scanner.nextInt();
                    fMovie.removeMovie(index);
                    break;
                case 3:
                    System.out.print("favori film listesi:");
                    fMovie.listMovies();
                    break;
                case 4:
                    exit = true;
                     break;
                default:
                    System.out.println("geçersiz işlem!!!!");
                    break;
            }

        }
    }
}
