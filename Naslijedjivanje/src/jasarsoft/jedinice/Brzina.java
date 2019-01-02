
package jasarsoft.jedinice;

/**
 *
 * @author jasarsoft
 */
public class Brzina {
    private double mps;
    
    private Brzina(double mps) {
        this.mps = mps;
    }
    
    public static Brzina fromMetaraPoSekundi(double mps) {
        return new Brzina(mps);
    }
    
    public static Brzina fromKilometaraPoSatu(double kmps) {
        return new Brzina (kmps /3.6);
    }
    
    public double toMetaraPoSekundi() {
        return this.mps;
    }
    
    public double toKilometaraPoSatu() {
        return this.mps * 3.6;
    }
    
    public void addMetaraPoSekundi(double mps) {
        this.mps += mps;
    }
    
    public void addKilometaraPoSatu(double kmph) {
        this.mps += kmph / 3.6;
    }
}
