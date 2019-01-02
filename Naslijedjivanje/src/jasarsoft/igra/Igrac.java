/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft.igra;

import jasarsoft.jedinice.Brzina;
import jasarsoft.jedinice.Lokacija;
import jasarsoft.jedinice.Ugao;

/**
 *
 * @author jasarsoft
 */
public class Igrac extends PokretanObjekat {
    private String ime = "";
    private double snaga = 0;
    private double zivot = 0;

    public Igrac(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina, Ugao.fromStepeni(0));
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }
    
    
}
