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
public class Put {
    private double metri;
    
    private Put(double metri) {
        this.metri = metri;
    }
    
    public static Put fromMetri(double metri) {
        return new Put(metri);
    }
    
    public static Put fromKilometri(double kilometri) {
        return new Put(kilometri * 1000.0);
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
