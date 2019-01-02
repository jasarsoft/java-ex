/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft.jedinice;

/**
 *
 * @author jasarsoft
 */
public class Duzina {
    private double metri;
    
    private Duzina(double metri) {
        this.metri = metri;
    }
    
    public static Duzina fromMetri(double metri) {
        return new Duzina(metri);
    }
    
    public static Duzina fromKilometri(double kilometri) {
        return new Duzina(kilometri * 1000.0);
    }
    
    public double toMetri() {
        return this.metri;
    }
    
    public double toKilometri() {
        return this.metri / 1000.0;
    }
    
    public void addMetri(double metara) {
        this.metri += metara;
    }
    
    public void addKilometara(double kilometri) {
        this.metri += kilometri * 1000.0;
    }
}
