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
public class PogadjanjeBrojeva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int zamisljenBroj; // broj koji je racunar izabrao
      int pokusanBroj;   // broj koji je korisnik pokusao

      Scanner tastatura = new Scanner(System.in);

      zamisljenBroj = (int)(100 * Math.random()) + 1;

      System.out.println("Zamislio sam cijeli broj izmedju 1 i 100.");
      System.out.println("Pokusajte da ga pogodite.\n");

      do {
         System.out.print("Pogodite broj: ");
         pokusanBroj = tastatura.nextInt();
         if (pokusanBroj < zamisljenBroj)
            System.out.println("Zamislio sam veci broj :-(");
         else if (pokusanBroj > zamisljenBroj)
            System.out.println("Zamislio sam manji broj :-(");
         else
            System.out.println("Bravo, pogodili ste broj :-)");
      } while (pokusanBroj != zamisljenBroj);
    }
    
}
