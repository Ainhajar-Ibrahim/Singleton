package singleton;
import java.io.*;
import java.util.*;
public class Terre {
     int age;
     int population;
    private static Terre instance= null;
    private Terre(int age,int population){
        this.age=age;
        this.population=population;
    }
    public synchronized static Terre getInstance(){

        if  (instance==null){
            instance=new Terre(20000,7000000);
        }
        return instance;
    }
    public static Terre create(){
        return Terre.getInstance();
    }
    void add(int n){
        population+=n;
    }
    void show(){
        System.out.println("la Terre a " + age +" ans et sa population est estimée à " + population);
    }


}
