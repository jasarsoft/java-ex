
package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {
    
    private static int getBrojRedovaOdKorisnika(){
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj redova matrice: ");
        return s.nextInt();
    }
    
    private static int getBrojKolonaOdKorisnika(){
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj kolona matrice: ");
        return s.nextInt();
    }

    public static void main(String[] args) {
        Matrica m1; 
        int brojRedova = getBrojRedovaOdKorisnika();
        int brojKolona = getBrojKolonaOdKorisnika();
        
        while(true){
            try{
                m1 = new Matrica(brojRedova, brojKolona);
                break;
            } catch (BadRowCountException ex){
                System.out.println("Niste odabrali isrpavan broj redova.");
                brojRedova = getBrojRedovaOdKorisnika();
            } catch (BadColumnCountException ex){
                System.out.println("Niste odabrali ispravan broj kolona");
                brojKolona = getBrojKolonaOdKorisnika();
            }
        }
        
        try{
            m1.set(10, 10, 3.1415);
        } catch (BadRowIndexException brie){
            System.out.println(brie.getMessage());
        } catch (BadColumnIndexException bcie){
            System.out.println(bcie.getMessage());
        }
    }
}
