package models;

import java.io.FileNotFoundException;

/**
 * Created by Sam Davies on 05/11/2015.
 */
public class ModelSingleton {
    private static Model instance = null;
    protected ModelSingleton() {
        // Exists only to defeat instantiation.
    }
    public static Model getInstance() {
        if(instance == null) {
            instance = new Model();
        }
        return instance;
    }
}
