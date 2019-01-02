
package jasarsoft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jasarsoft
 */
public class CitanjeIzDatoteke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fajl="ulaz.txt";
        String tekst;
        
        try {
            //otvaranje fajla za citanje podataka
            FileInputStream input=new FileInputStream(fajl);
            //slicno kao za upis, fajl mora da je u korijenu projekta ili da je zadat kompletnom putanjom
            //pravimo scanner isto kao za citanje sa standardnog ulaza - System.in samo sto citamo iz fajla
            Scanner scFajl=new Scanner(input);
            
            System.out.println("Procitan red iz fajla:");
            System.out.println(scFajl.nextLine());
            
            //da bi procitali sve iz fajla, koristimo metod hasNext()
            while(scFajl.hasNext()){
                System.out.println("Procitan red iz fajla:");
                System.out.println(scFajl.nextLine());
            }
           
            
            //obavezno zatvaranje fajla po zavrsetku rada
            input.close();
        } catch (FileNotFoundException ex) {
            //ovaj blok se izvrsava ukoliko ne uspije otvaranje datoteke
            System.out.println("Neuspjesno otvaranje datoteke za citanje "+fajl);
        } catch (IOException ex) {
            //ovaj blok se izvrsava ukoliko ne uspije zatvaranje fajla
        }
        //mozemo da imamo i scanner za citanje sa standardno ulaza  
        Scanner sc=new Scanner(System.in);
        System.out.println("Procitan red sa standardnog ulaza:");
        System.out.println(sc.nextLine());
    }
    
}
