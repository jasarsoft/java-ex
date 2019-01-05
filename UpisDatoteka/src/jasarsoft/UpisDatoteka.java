
package jasarsoft;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpisDatoteka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Unesite tekst koji ce biti upisan u fajl: ");
        String tekst=sc.nextLine();
        
        System.out.println("Unesite ime fajla u koji zelite da upisete tekst: ");
        String fajl=sc.nextLine();
        try {
            //otvaranje fajla za upis, mora da bude u try bloku
            PrintWriter pw=new PrintWriter(fajl);
            //da bi mogao da se otvori fajl, mora da se nalazi u korenu projekta (folder u kom je src folder i drugi)
            //ako fajl nije tu, mora se navesti cela putanja
            
            pw.println("Tekst koji je korisnik uneo u programu je: ");
            pw.println(tekst);
            
            //da bi se sacuvalo ono sto je napisano, potrebno je pozvati metod flush()
            pw.flush();
            
            //obavezno zatvaranje fajla nakon sto se zavrsi sa radom
            pw.close();
        } catch (FileNotFoundException ex) {
            //ukoliko ne uspe otvaranje fajla, bice odradjene komande iz ovog (catch) bloka
            System.out.println("Neuspesno otvaranje fajla "+fajl+" za upis");
        }
    }
    
}
