
package exceptionhandling;

public class BadColumnCountException extends Exception {
    
    public BadColumnCountException(int unijetiBrojKolona){
        super("Broj kolona matrice ne moze da bude " + unijetiBrojKolona + ", vec mora biti veci od 0.");
    }
    
}
