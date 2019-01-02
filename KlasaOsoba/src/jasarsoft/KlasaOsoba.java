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
public class KlasaOsoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba o=new Osoba();
        o.setIme("Eva");
        o.setPrezime("Tuba");
        o.setJmbg("2222222");
        
        o.odstampaj();
    }
    
}
