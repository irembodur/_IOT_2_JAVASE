package mext2_çalışamalr.spotify;

import java.util.ArrayList;
import java.util.List;

public class spotify {
    List<String> musics;

    public spotify(){
        musics = new ArrayList<>();
    }

    public void addMusic(String music){
        musics.add(music);
    }

    public void removeMusic(int index){
        musics.remove(index);
    }

    public void listMusics(){
        for (String music: musics){
            System.out.println("şarkı " + music);
        }
    }
}
