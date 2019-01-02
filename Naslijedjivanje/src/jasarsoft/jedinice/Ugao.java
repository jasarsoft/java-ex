/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft.jedinice;

/**
 *
 * @author jasarsoft
 */
public class Ugao {
    private double radijani;

    private Ugao(double radijani) {
        this.radijani = radijani;
    }
    
    public static Ugao fromRadijani(double radijani) {
        return new Ugao(radijani);
    }
    
    public static Ugao fromStepeni(double stepeni) {
        return new Ugao(stepeni * Math.PI / 180.0);
    }
    
    public  double toRadijani() {
        return radijani;
    }
    
    public double toStepeni() {
        return radijani * 180.0 / Math.PI;
    }
    
    public void rotateLeft(Ugao ugao) {
        radijani = Math.toRadians(toStepeni() + ugao.toStepeni());
    }
    
    public void rotateRight(Ugao ugao) {
        radijani = Math.toRadians(toStepeni() - ugao.toStepeni());
    }
}
