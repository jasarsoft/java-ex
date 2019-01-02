package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class PrirodniBrojevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*da bi se ucitalo sa tastature potrebno je definisati scanner
        koji moze da se nazove bilo kako, u ovom slucaju je sc*/
        Scanner sc=new Scanner(System.in);
        
        //------------------------TRECI ZADATKA-----------------------------
        //Uneti prirodan broj x i ispisati sve prirodne brojeve od 1 do x
        
        System.out.println("Unesite prirodan broj x:");
        int x=sc.nextInt();
        
        while(x>0){
            System.out.println(x);
            x=x-1; //ili x--; ili x-=1;
        }
        
        //---------------------KRAJ TRECEG ZADATKA--------------------------
    }
    
}
