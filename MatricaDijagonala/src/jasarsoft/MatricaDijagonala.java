package jasarsoft;

import java.util.Scanner;
/**
 *
 * @author jasarsoft
 */
public class MatricaDijagonala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Unesite dimenziju n matrice");
        int n=sc.nextInt();
        
        double[][] matrica=new double[n][n]; //matrica sa n redova i m kolona
        
        System.out.println("Generisem matricu...");
        for (int i = 0; i < n; i++) {//spoljni for prolazi kroz redova
            for (int j = 0; j < n; j++) {//za svaki red, unutrasnji for prolazi kroz kolone
                matrica[i][j]=Math.random();
            }            
        }
        
        
        //stampa matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();// kada se odstampa prvi red, stampamo novi red
        }
        
        //poziv metode koja racuna sumu na dijagonali
        double sumaD=sumaDijagonala(matrica);
        System.out.println("Suma na dijagonali je "+sumaD);
        
        //postavljanje elemenata na sporednoj dijagonali
        //za elemente na sporednoj dijagonali vazi zakonitost da je suma indeksa konstantna
        //i jednaka n-1, gde je n dimenzija matrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1)
                    matrica[i][j]=100;
            }
        }
        
        //stampa matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();// kada se odstampa prvi red, stampamo novi red
        }
    }
    
    public static double sumaDijagonala(double matrica[][]){
        double suma=0;
        //elementi na dijagonali su oni koji imaju iste indekse, matrica[0][0], matrica[1][1],....
        for (int i = 0; i < matrica.length; i++) {
            suma+=matrica[i][i];
        }
        return suma;
    }
}
