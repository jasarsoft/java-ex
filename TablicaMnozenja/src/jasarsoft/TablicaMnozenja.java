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
public class TablicaMnozenja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int vrsta = 1; vrsta < 10; vrsta++) {
            for (int kolona = 1; kolona < 10; kolona++)
               System.out.printf("%4d", vrsta * kolona);
            System.out.println();  // prelazak u novi red na ekranu
        }
    }
    
}
