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
public class WrapperKlase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        prikaziPredjeniPut(Brzina.fromMetaraPoSekundi(110), Vrijeme.fromSekunde(4));
    }
    
    public static void prikaziPredjeniPut(Brzina brzina, Vrijeme vrijeme) {
        Put p = Put.fromMetri(brzina.toMetaraPoSekundi() * vrijeme.toSekunde());
        
        System.out.println("Predjeni put je: " + p.toKilometri() + "km");
    }
}
