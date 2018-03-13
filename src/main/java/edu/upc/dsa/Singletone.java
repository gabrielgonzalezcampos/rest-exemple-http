package edu.upc.dsa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Singletone {
    private static Singletone ourInstance;

    private List<Track> tracks;

    public static Singletone getInstance() {
        if (ourInstance==null)
            ourInstance = new Singletone();
        return ourInstance;
    }

    private Singletone() {
        tracks= new ArrayList<>();
        Track t1 = new Track();
        t1.setTitle("Enter Sandman");
        t1.setSinger("Metallica");
        tracks.add(t1);

        Track t2 = new Track();
        t2.setTitle("La Barbacoa");
        t2.setSinger("Georgie Dann");
        tracks.add(t2);
    }

    public List<Track> getTrack(){
//        log.info("key:"+key+" "+" language"+language);
        return this.tracks;
    }
}
