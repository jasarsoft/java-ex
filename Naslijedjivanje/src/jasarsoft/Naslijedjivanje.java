
package jasarsoft;

import jasarsoft.igra.*;
import jasarsoft.jedinice.*;
import java.util.*;

/**
 *
 * @author jasarsoft
 */
public class Naslijedjivanje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Objekat> listaObjekataIgre = new LinkedList<>();
        
        NepokretanObjekat d1 = new NepokretanObjekat(
                new Lokacija(Duzina.fromMetri(10), Duzina.fromMetri(10)), 
                "slike/drvo.png", 
                "Drvo");
        
        Vuk v1 = new Vuk(
            new Lokacija(Duzina.fromMetri(10), Duzina.fromMetri(12)),
            "slike/vuk.png",
            Brzina.fromKilometaraPoSatu(40),
            "crna");
        
        Vuk v2 = new Vuk(
            new Lokacija(Duzina.fromMetri(10), Duzina.fromMetri(13)),
            "slike/vuk.png",
            Brzina.fromKilometaraPoSatu(45),
            "siva");
        
        Igrac i = new Igrac(
            new Lokacija(Duzina.fromMetri(30), Duzina.fromMetri(33)),
            "slika/pacman.png",
            Brzina.fromKilometaraPoSatu(30));
        
        
        listaObjekataIgre.add(d1);
        listaObjekataIgre.add(v1);
        listaObjekataIgre.add(v2);
        listaObjekataIgre.add(i);
        
        System.out.println(listaObjekataIgre.size());
    
    }    
}
