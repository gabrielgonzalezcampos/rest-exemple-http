package edu.upc.dsa;


import java.util.HashMap;
import java.util.ResourceBundle;

public class Singletone {
    private static Singletone ourInstance;

    private HashMap<String,ResourceBundle> data;

    public static Singletone getInstance() {
        if (ourInstance==null)
            ourInstance = new Singletone();
        return ourInstance;
    }

    private Singletone() {
        data= new HashMap<String, ResourceBundle>();
    }

    public String GetText(String key,String language){
//        log.info("key:"+key+" "+" language"+language);
        ResourceBundle rb= data.get(language);
        if(rb==null)
        {
            rb=ResourceBundle.getBundle("I18N."+language);
            data.put(language, rb);
        }
        return rb.getString(key);
    }
}
