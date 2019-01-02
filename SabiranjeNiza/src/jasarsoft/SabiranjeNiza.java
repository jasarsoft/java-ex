/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

import java.util.*;
/**
 *
 * @author jasarsoft
 */
public class SabiranjeNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x, s; // broj sabiraka, aktuelni sabirak, zbir sabiraka

        // Inicijalizacija zbira
        s = 0;

        // Ucitavanje ulaznih podataka preko tastature
        Scanner tastatura = new Scanner(System.in);

        // U�itavanje broja sabiraka niza
        System.out.print("Unesite broj sabiraka niza: ");
        n = tastatura.nextInt();

        // Ucitavanje i sabiranje sabiraka
        for (int i = 1; i <= n; i++) {
           System.out.print("Unesite " + i + ". sabirak: ");
           x = tastatura.nextInt();
           s = s + x;
        }

        // Prikazivanje izracunatog zbira
        System.out.println();
        System.out.println("Zbir sabiraka je: " + s);
    }
    
}
