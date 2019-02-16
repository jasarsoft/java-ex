
package exceptionhandling;

public class BadRowIndexException extends Exception {

    public BadRowIndexException(int unijetiBrojRedova, int najveciIndexReda) {
        super("Matrica nema red na indexu " + unijetiBrojRedova + ". najveci index je: " + najveciIndexReda);
    }
    
}
