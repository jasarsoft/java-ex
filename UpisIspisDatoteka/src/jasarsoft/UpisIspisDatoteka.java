/*
Napraviti klasu Stan koja ima polja ulica, broj, brojSoba, kvadratura. 
Implementirati konstruktor, get i set metode.
U fajlu spisakStanova se nalazi spisak stanova, u svakom redu podaci za jedan stan: kvadratura, brojSoba, broj, ulica
Za sve stanove iz fajla izracunati cijenu: brojSoba*kvadratura*1000;
U fajl cijene.txt upisati cijene ucitanih stanova.
 */
package jasarsoft;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpisIspisDatoteka {

    public static void main(String[] args) {
        try {
            //otvaranje fajla za citanje podataka
            FileInputStream input=new FileInputStream("spisakStanova.txt");
            Scanner scFajl=new Scanner(input);
            
           //otvaranje fajla za upis
            PrintWriter pw=new PrintWriter("cijene.txt");
            
            //da bi procitali sve iz fajla, koristimo metod hasNext(), sve dok ima sljedeci red
            while(scFajl.hasNext()){
               //citamo red po red, gde je svaki red kvadratura, brojSoba, broj, ulica
               int kvadratura=scFajl.nextInt();
               int brojSoba=scFajl.nextInt();
               int broj=scFajl.nextInt();
               String ulica=scFajl.nextLine();
               
               Stan s=new Stan(ulica, broj, brojSoba, kvadratura);
               pw.println("Cijena stana u ulici "+ulica+" "+broj+" je: "+s.cenaStana()); 
            }
            //da bi se sacuvalo ono sto je napisano, potrebno je pozvati metod flush()
            pw.flush();
            //obavezno zatvaranje fajla nakon sto se zavrsi sa radom
            pw.close();
            //obavezno zatvaranje fajla po zavrsetku rada
            input.close();

        } catch (FileNotFoundException ex) {
            //ukoliko ne uspije otvaranje fajla, bice odradjene komande iz ovog (catch) bloka
            System.out.println("Neuspesno otvaranje fajla za upis");
        } catch (IOException ex) {
            //ukoliko ne uspije zatvanje fajla, bice odradjene komande iz ovog (catch) bloka
            System.out.println("Neuspesno zatvaranje fajla za citanje");
        }
    }
    
}
