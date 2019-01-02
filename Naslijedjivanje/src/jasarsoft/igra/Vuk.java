
package jasarsoft.igra;

import jasarsoft.jedinice.Brzina;
import jasarsoft.jedinice.Lokacija;

/**
 *
 * @author jasarsoft
 */
public class Vuk extends Neprijatelj {
    private String boja;

    public Vuk(Lokacija lokacija, String slika, Brzina brzina, String boja) {
        super(lokacija, slika, brzina);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }
}
