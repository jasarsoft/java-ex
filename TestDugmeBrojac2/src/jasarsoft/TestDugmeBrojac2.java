/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author jasarsoft
 */
public class TestDugmeBrojac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DugmeBrojacOkvir okvir = new DugmeBrojacOkvir();
        okvir.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Pridruživanje rukovaoca događaja zatvaranja okvira kao
        // instance anonimne klase koja proširuje WindowAdapter
        okvir.addWindowListener(new WindowAdapter() {

           public void windowClosing(WindowEvent e) {

              Object[] opcija = {"Da", "Ne"};
              int izabranaOpcija = JOptionPane.showOptionDialog(null,
                               "Zaista želite da završite program?",
                               "Kraj rada programa",
                               JOptionPane.DEFAULT_OPTION,
                               JOptionPane.WARNING_MESSAGE,
                               null, opcija, opcija[0]);

              if (izabranaOpcija == 0)
                 System.exit(0);
           }
        });
        okvir.setVisible(true);
    }
    
}
