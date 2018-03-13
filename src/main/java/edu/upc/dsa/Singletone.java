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
    }

    public List<Track> getTrack(){
//        log.info("key:"+key+" "+" language"+language);
        return this.tracks;
    }
}
