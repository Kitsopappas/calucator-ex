/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panos
 */
public class Car {
    public String color;
    public int cc;
    private String owner;
    public static int horses;

    private static final double MILES_CONVERTER = 0.621371;
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Car(String color, int cc, String owner,int horses) {
        this.color = color;
        this.cc = cc;
        this.owner = owner;
        this.horses=horses;
    }
    public void changeHorses(){
        horses=horses*2;
    }
    
    public static void converKm(int km){
        
        double x = km * MILES_CONVERTER;
        System.out.println("miles: " + x);
    
    }
}
