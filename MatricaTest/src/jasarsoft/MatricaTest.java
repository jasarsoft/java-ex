
package jasarsoft;

import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class MatricaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Unesite dimenziju n matrice");
        int n=sc.nextInt();
        System.out.println("Unesite dimenziju m matrice");
        int m=sc.nextInt();
        int[][] matrica=new int[n][m]; //matrica sa n redova i m kolona
        
        System.out.println("Unesite elemente matrice (red po red)");
        for (int i = 0; i < n; i++) {//spoljni for prolazi kroz redova
            for (int j = 0; j < m; j++) {//za svaki red, unutrasnji for prolazi kroz kolone
                matrica[i][j]=sc.nextInt();
            }
            System.out.println("Unet "+(i+1)+". red");
        }
        System.out.println("Unesite k");
        int k=sc.nextInt();
        //prolazak kroz matricu i postavljanje elemenata manjih od k na 0. 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrica[i][j]<k)
                    matrica[i][j]=0;
            }
        }
        
        //stampa matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();// kada se odstampa prvi red, stampamo novi red
        }
    }
    
}
