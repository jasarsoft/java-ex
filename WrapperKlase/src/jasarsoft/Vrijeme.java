/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

/**
 *
 * @author jasarsoft
 */
public class Vrijeme {
    private double sekunde;
    
    private Vrijeme(double sekunde){
        this.sekunde = sekunde;
    }
    
    public static Vrijeme fromSekunde(double sekunde){
        return new Vrijeme(sekunde);
    }
    
    public static Vrijeme fromMinute(double minute) {
        return new Vrijeme(minute * 60);
    }
    
    public static Vrijeme formSati(double sati) {
        return new Vrijeme(sati * 3600.);
    }
    
    public double toSekunde() {
        return this.sekunde;
    }
    
    public double toMinute() {
        return this.sekunde * 60.0;
    }
    
    public double toSati() {
        return this.sekunde * 3600.0;
    }
    
    public double toMilisekunde() {
        return this.sekunde * 1000.0;
    }
    
    public void addSekunde(double sekunde) {
        this.sekunde += sekunde;
    }
    
    public void addMinute(double minute) {
        this.sekunde += minute * 60.0;
    }
}
