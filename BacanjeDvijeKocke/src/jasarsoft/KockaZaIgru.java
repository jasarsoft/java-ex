/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

/**
 *
 * @author jasarsoft
 */
public class KockaZaIgru {
    public int broj;             // broj koji je pao na gornjoj strani

    public void baci() {         // ,,bacanje'' kocke
       broj = (int)(6*Math.random()) + 1;
    }
}
