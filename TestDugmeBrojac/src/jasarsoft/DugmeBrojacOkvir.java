/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author jasarsoft
 */
// Glavni okvir sa dugmetom i oznakom
public class DugmeBrojacOkvir extends JFrame {
     private JLabel oznaka; // oznaka u okviru

    // Ugnjezdena klasa rukovaoca akcijskog dogadaja
    private class RukovalacDugmeta implements ActionListener {

       private int brojac;    // brojac pritisaka na dugme

       public void actionPerformed(ActionEvent e) {
          brojac++;
          oznaka.setText("Broj pritisaka = " + brojac);
       }
    }

    // Konstruktor
    public DugmeBrojacOkvir() {

       setTitle("Brojanje pritisaka na dugme ");
       setSize(300, 150);
       setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

       oznaka = new JLabel("Broj pritisaka = 0");
       add(oznaka);
       JButton dugme = new JButton("Pritisni me");
       add(dugme);
       dugme.addActionListener(new RukovalacDugmeta());
    }
}
