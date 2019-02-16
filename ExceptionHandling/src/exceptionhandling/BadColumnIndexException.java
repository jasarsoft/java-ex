
package exceptionhandling;

public class BadColumnIndexException extends Exception  {
     public BadColumnIndexException(int unijetiBrojKolona, int najveciIndexKolona) {
        super("Matrica nema kolone na indexu " + unijetiBrojKolona + ". najveci index je: " + najveciIndexKolona);
    }
}
