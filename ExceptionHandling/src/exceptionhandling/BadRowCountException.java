
package exceptionhandling;


public class BadRowCountException extends Exception {
    
    public BadRowCountException(int unijetiBrojRedova){
        super("Broj redova matrice ne moze da bude " + unijetiBrojRedova + ", vec mora biti veci od 0.");
    }
}
