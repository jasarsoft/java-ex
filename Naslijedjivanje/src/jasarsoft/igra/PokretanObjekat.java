
package jasarsoft.igra;

import jasarsoft.jedinice.*;

/**
 *
 * @author jasarsoft
 */
public abstract class PokretanObjekat extends Objekat {
    private Brzina brzina;
    private Ugao ugao;

    public PokretanObjekat(Lokacija lokacija, String slika, Brzina brzina, Ugao ugao) {
        super(lokacija, slika);
        this.brzina = brzina;
        this.ugao = ugao;
    }

    public Brzina getBrzina() {
        return brzina;
    }
    
    public Ugao getUgao() {
        return ugao;
    }
    
    public void move(Vrijeme vrijeme) {
        getLokacija().move(ugao, Duzina.fromMetri(brzina.toMetaraPoSekundi()));
    }
}
