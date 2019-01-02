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
public class Sutra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Ulaz programa se dobija preko tastature
      Scanner tastatura = new Scanner(System.in);

      // Ucitavanje datuma u formatu dan mes god
      System.out.print("Unesite datum u formatu d m g: ");
      int dan = tastatura.nextInt();    // dan datog datuma
      int mjesec = tastatura.nextInt();  // mesec datog datuma
      int godina = tastatura.nextInt(); // godina datog datuma

      // Odredivanje broja dana u datom mjesecu
      int maxDan = 0;  // broj dana u datom mjesecu
      switch (mjesec) {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            maxDan = 31;
            break;
         case 4: case 6: case 9: case 11:
            maxDan = 30;
            break;
         case 2:
            if (godina % 4 == 0)  // && godina % 100 != 0 || godina % 400 ==0
               maxDan = 29;
            else
               maxDan = 28;
            break;
         default:
            System.out.println("Pogresan mjesec!\n");
            System.exit(0);
      }

      // Izracunavanje sutrasnjeg datuma
      if (dan < maxDan)
         dan = dan + 1;
      else {
         dan = 1;
         if (mjesec < 12)
            mjesec = mjesec + 1;
         else {
            mjesec = 1;
            godina = godina + 1;
         }
      }

      // Prikazivanje sutrasnjeg datuma na ekranu
      System.out.print("Sutrasnji datum je: ");
      System.out.println(dan + " " + mjesec + " " + godina);
    }
    
}
