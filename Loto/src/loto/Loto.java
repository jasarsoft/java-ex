/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto;

import java.util.*;

/**
 *
 * @author jasarsoft
 */
public class Loto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 39;  // duzina niza svih loto-brojeva
        final int K = 7;   // duzina izvucene kombinacije

        // Inicijalizacija niza (bubnja) brojevima 1, 2, ..., N
        int[] bubanj = new int[N];
        for (int i = 0; i < N; i++)
           bubanj[i] = i + 1;

        int m;  // granica lijevog i desnog dijela niza

        // Izvlacenje K brojeva i premjestanje u desni deo niza
        for (m = N-1; m > N-K-1; m--) {
           // Generisanje slusajnog indeksa lijevog dijela niza
           int i = (int)(Math.random() * (m+1));

           // Medjusobna zamena slucajnog elementa i poslednjeg elementa levog dela niza
           int broj = bubanj[i];
           bubanj[i] = bubanj[m];
           bubanj[m] = broj;
        }

        // Kopiranje izvucenih brojeva u novi niz
        int[] kombinacija = Arrays.copyOfRange(bubanj, m+1, N);

        // Sortiranje novog niza
        Arrays.sort(kombinacija);

        // Prikazivanje izvucenih brojeva u rastucem redosljedu
        System.out.println("Dobitna kombinacija je: ");
        for (int i = 0; i < kombinacija.length; i++){
           System.out.print(kombinacija[i] + "  ");
        }
        System.out.println();
    }
    
}
