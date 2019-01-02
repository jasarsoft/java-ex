
package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class Promjenljive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ispis na ekran
        System.out.println("Zdravo!");
        
        /*da bi se ucitalo sa tastature potrebno je definisati scanner
        koji moze da se nazove bilo kako, u ovom slucaju je sc*/
        Scanner sc=new Scanner(System.in);
        
        //primitivni tipovi podataka koji postoje u Javi
        byte a; //ceo broj, zapisan u 1 bajt
        short b; //ceo broj, zapisan u 2 bajta
        int c; //ceo broj, zapisan u 4 bajta
        long d; //ceo broj, zapisan u 8 bajta
        float e; //razlomljen broj, zapisan u 4 byte
        double f; //razlomljen broj, zapisan u 8 bajta
        char g; //karakter (slova, brojevi, znakovi), 2 bajta
        boolean h; //logicki tip podatak, ima vrednost true ili false, 1 bit
        
        //za ucitavanje svih primitivnih tipova osim char postoji odgovarajuca Scanner.next metoda
        System.out.println("Unesite vrednost za promenljivu tipa byte!");
        a=sc.nextByte();
        
        System.out.println("Unesite vrednost za promenljivu tipa short!");
        b=sc.nextShort();
        
        System.out.println("Unesite vrednost za promenljivu tipa int!");
        c=sc.nextInt();
        
        System.out.println("Unesite vrednost za promenljivu tipa double!");
        f=sc.nextDouble();
                
        System.out.println("Unesite vrednost za promenljivu tipa boolean!");
        h=sc.nextBoolean();
        
        //ucitavanje jednog karaktera sa ulaza
        System.out.println("Unesite vrednost za promenljivu tipa char!");
        g=sc.next().charAt(0);
        
        //dodatno cemo koristiti ucitavanje stringa (teksta)
        System.out.println("Unesite vrednost za promenljivu tipa String!");
        String s=sc.nextLine();   
    }
    
}
