/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class UparivanjeBrojeva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*da bi se ucitalo sa tastature potrebno je definisati scanner
        koji moze da se nazove bilo kako, u ovom slucaju je sc*/
        Scanner sc=new Scanner(System.in);
        
        //------------------------DRUGI ZADATKA-----------------------------
        //Ucitati dva realna broja i odstampati manji, a ukoliko su jednaki, 
        //ispisati poruku "Uneti brojevi su jednaki."  
        float a,b;
        System.out.println("Unesite prvi broj");
        a=sc.nextFloat();
        
        System.out.println("Unesite drugi broj");
        b=sc.nextFloat();
        
        if(a==b){
            System.out.println("Uneti brojevi su jednaki.");
        }
        else if(a<b){
            System.out.println("Manji je prvi broj a="+a);
        }
        else {
            System.out.println("Manji je drugi broj b="+b);
        }
    }
    
}
