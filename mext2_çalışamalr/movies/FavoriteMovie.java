package mext2_çalışamalr.movies;

import java.util.ArrayList;
import java.util.List;

public class FavoriteMovie {
    List<String> movies;

    public FavoriteMovie(){
        movies = new ArrayList<>();
    }

    public void addMovie(String movie){
        movies.add(movie);

    }

    public void removeMovie(int index){
        movies.remove(index);
    }

    public void listMovies(){
        for (String movie: movies){
            System.out.println("film " + movie);
        }
    }


}
