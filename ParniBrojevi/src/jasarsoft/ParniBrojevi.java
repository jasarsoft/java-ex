
package jasarsoft;

//ukljucivanje Scanner potrebnog za ucitavanje sa tastature
import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class ParniBrojevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*da bi se ucitalo sa tastature potrebno je definisati scanner
        koji moze da se nazove bilo kako, u ovom slucaju je sc*/
        Scanner sc=new Scanner(System.in);
        
        //------------------------CETVRTI ZADATKA-----------------------------
        //Uneti prirodan broj m i ispisati sve parne brojeve od 1 do m
        
        System.out.println("Unesite prirodan broj m:");
        int m=sc.nextInt();
        
        while(m>0){
            if(m%2==0){ //uslov da je broj paran -> ako je ostatak pri deljenju sa 2 jednak 0
                System.out.println(m);
            }
            m=m-1; //ili m--; ili m-=1;
        }
        
        //---------------------KRAJ CETVRTOG ZADATKA--------------------------
    }
    
}
