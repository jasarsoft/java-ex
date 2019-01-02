/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopirajfajl;
import java.io.*;
/**
 *
 * @author jasarsoft
 */
public class KopirajFajl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String imeOriginala;
        String imeKopije;
        InputStream original;
        OutputStream kopija;
        boolean uvek = false;
        int brojBajtova;  // ukupan broj kopiranih bajtova

        // Odre�ivanje imena datoteka iz komandnog reda
        if (args.length == 3 && args[0].equalsIgnoreCase("-u")) {
           imeOriginala = args[1];
           imeKopije = args[2];
           uvek = true;
        }
        else if (args.length == 2) {
           imeOriginala = args[0];
           imeKopije = args[1];
        }
        else {
           System.out.println("Upotreba: java KopirajFajl <original> <kopija>");
           System.out.println("   ili    java KopirajFajl -u <original> <kopija>");
           return;
        }

        // Konstruisanje ulaznog toka
        try {
           original = new FileInputStream(imeOriginala);
        }
        catch (FileNotFoundException e) {
           System.out.print("Ulazna datoteka \"" + imeOriginala + "\"");
           System.out.println(" ne postoji.");
           return;
        }

        // Proveravanje da li izlazna datoteka ve� postoji
        File datoteka = new File(imeKopije);
        if (datoteka.exists() && uvek == false) {
           System.out.println("Izlazna datoteka postoji. Koristite -u za njenu zamenu.");
           return;
        }

        // Konstruisanje izlaznog toka
        try {
           kopija = new FileOutputStream(imeKopije);
        }
        catch (IOException e) {
           System.out.print("Izlazna datoteka \"" + imeKopije + "\"");
           System.out.println(" ne moze se otvoriti.");
           return;
        }

        // Bajt po bajt prepisivanje iz ulaznog toka u izlazni tok
        brojBajtova = 0;
        try {
           while(true) {
              int b = original.read();
              if (b < 0) break;
              kopija.write(b);
              brojBajtova++;
           }
           System.out.print("Kopiranje zavrzeno: kopirano ");
           System.out.println(brojBajtova + " bajtova.");
        }
        catch (Exception e) {
           System.out.print("Neuspjesno kopiranje (kopirano ");
           System.out.println(brojBajtova + " bajtova).");
           System.out.println("Greska: " + e);
        }
        finally {
           try {
              original.close();
              kopija.close();
           }
           catch (IOException e) {
           }
        }
    }
    
}
