//Program demonstrira koriscenje if/else i switch naredbe
package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;

public class DaniUSedmiciSwitch {

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
        
        //RESENJE POMOCU SWITCH
        switch(n){
            //case 1 znaci slucaj kada je n==1, pa bi case 55 bilo za slucaj kada je n==55
            case 1: {
                System.out.println("Ponedeljak");
                break;
            }
            case 2: {
                System.out.println("Utorak");
                break;
            }
            case 3: {
                System.out.println("Sreda");
                break;
            }
            case 4: {
                System.out.println("Cetvrtak");
                break;
            }
            case 5: {
                System.out.println("Petak");
                break;
            }
            case 6: {
                System.out.println("Subota");
                break;
            }
            case 7: {
                System.out.println("Nedelja");
                break;
            }
            //ukoliko nije ni jedan od navedenih slucaja, onda se izvrsava default blok
            default: {
                System.out.println("Pogresan unos!!!");
                break;
            }
        }        
    }
    
}
