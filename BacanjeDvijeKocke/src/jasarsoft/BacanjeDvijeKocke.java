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
public class BacanjeDvijeKocke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int brojBacanja = 0;  // brojač bacanja dve kocke
        KockaZaIgru kocka1 = new KockaZaIgru();  // prva kocka
        KockaZaIgru kocka2 = new KockaZaIgru();  // druga kocka

        do {
           kocka1.baci();
           System.out.print("Na prvoj kocki je pao broj: ");
           System.out.println(kocka1.broj);

           kocka2.baci();
           System.out.print("Na drugoj kocki je pao broj: ");
           System.out.println(kocka2.broj);

           brojBacanja = brojBacanja + 1;   // uračunati bacanje

        } while (kocka1.broj != kocka2.broj);

        System.out.print("Dve kocke su bačene " + brojBacanja);
        System.out.println(" puta pre nego što je pao isti broj.");
    }
}
