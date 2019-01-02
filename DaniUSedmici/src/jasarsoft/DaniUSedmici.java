//Program demonstrira koriscenje if/else i switch naredbe
package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class DaniUSedmici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*da bi se ucitalo sa tastature potrebno je definisati scanner
        koji moze da se nazove bilo kako, u ovom slucaju je sc*/
        Scanner sc=new Scanner(System.in);
        
    //------------------------PRVI ZADATAK-----------------------------
        
        /*Ucitati sa tastature broj izmedju 1 i 7 i odstampati odgovarajuci dan u nedelji:
          za unet broj 1 -> stampati Ponedeljak, za unet broj 2 -> stampati Utorak, itd
          ukoliko se unese broj koji nije izmedju 1 i 7, stampati "Pogresan unos!!!"
          ZADATAK URADITI POMOCU IF/ELSE I POMOCU SWITCH NAREDBE
        */
        System.out.println("Unesite broj izmedju 1 i 7:");
        int n=sc.nextInt();
        
        //RESENJE POMOCU IF/ELSE
        if(n==1) {
            System.out.println("Ponedeljak");
        }
        else if(n==2) {
            System.out.println("Utorak");
        }
        else if(n==3) {
            System.out.println("Sreda");
        }
        else if(n==4) {
            System.out.println("Cetvrtak");
        }
        else if(n==5) {
            System.out.println("Petak");
        }
        else if(n==6) {
            System.out.println("Subota");
        }
        else if(n==7) {
            System.out.println("Nedelja");
        }
        else {
            System.out.println("Pogresan unos!!!");
        }
    }
    
}
