
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Prozor extends javax.swing.JFrame {

    /**
     * Creates new form Prozor
     */
    public Prozor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButtonPisanjeFajl = new javax.swing.JButton();
        jButtonCitanjeFajl = new javax.swing.JButton();
        jButtonCitaj = new javax.swing.JButton();
        jButtonUpisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldIme = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonProsek = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldJMBG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prezime");

        jLabel2.setText("Ime");

        jLabel3.setText("Fakultet");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Regularan");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Zaposlen");

        jButtonPisanjeFajl.setText("Fajl za upis");
        jButtonPisanjeFajl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPisanjeFajlActionPerformed(evt);
            }
        });

        jButtonCitanjeFajl.setText("Fajl za citanje");
        jButtonCitanjeFajl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCitanjeFajlActionPerformed(evt);
            }
        });

        jButtonCitaj.setText("Ucitaj");
        jButtonCitaj.setToolTipText("");
        jButtonCitaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCitajActionPerformed(evt);
            }
        });

        jButtonUpisi.setText("Upisi");
        jButtonUpisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpisiActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIR", "TF", "FTHM" }));

        jButtonProsek.setText("Prosek");
        jButtonProsek.setToolTipText("");
        jButtonProsek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProsekActionPerformed(evt);
            }
        });

        jLabel4.setText("JMBG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldIme, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                                .addGap(181, 181, 181))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonPisanjeFajl)
                                    .addGap(32, 32, 32)
                                    .addComponent(jButtonUpisi))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCitanjeFajl)
                                        .addGap(67, 67, 67)
                                        .addComponent(jButtonCitaj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonProsek))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton1)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCitanjeFajl)
                    .addComponent(jButtonCitaj)
                    .addComponent(jButtonProsek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPisanjeFajl)
                    .addComponent(jButtonUpisi))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Scanner sc=null;
    private void jButtonCitanjeFajlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCitanjeFajlActionPerformed
       JFileChooser fc=new JFileChooser();
       fc.showOpenDialog(jLabel1);
       File file = fc.getSelectedFile();
        try {
            sc=new Scanner(file);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Neuspelo otvaranje fajla za citanje!!!");
        }
    }//GEN-LAST:event_jButtonCitanjeFajlActionPerformed

    ArrayList<Student> studenti;
    
    private void jButtonCitajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCitajActionPerformed
        if(sc==null)
            JOptionPane.showMessageDialog(this,"Fajl za citanje podataka nije otvoren!!!","Obavestenje",JOptionPane.INFORMATION_MESSAGE);
        else{
            JOptionPane.showMessageDialog(this,"Fajl za citanje podataka je otvoren!!!","Obbavestenje",JOptionPane.INFORMATION_MESSAGE);
            studenti=new ArrayList<Student>();
            String ime,prezime,fakultet,jmbg;
            boolean zaposlen;
            while(sc.hasNext()){
                ime=sc.nextLine();
                prezime=sc.nextLine();
                jmbg=sc.nextLine();
                fakultet=sc.nextLine();
                if(sc.nextLine().compareTo("zaposlen")==0) zaposlen=true;
                else zaposlen=false;
                
                Student s=new Student(ime,prezime,jmbg,fakultet,zaposlen);
                studenti.add(s);
                
                jTextArea1.append(s.toString()+"\n");
            }
        }
    }//GEN-LAST:event_jButtonCitajActionPerformed

    PrintWriter pw=null;
    
    private void jButtonPisanjeFajlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPisanjeFajlActionPerformed
       JFileChooser fc=new JFileChooser();
       fc.showOpenDialog(jLabel1);
       File file = fc.getSelectedFile();
        try {
            pw=new PrintWriter(file);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Neuspelo otvaranje fajla za pisanje!!!");
        }
    }//GEN-LAST:event_jButtonPisanjeFajlActionPerformed

    private void jButtonUpisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpisiActionPerformed
        if(pw==null) 
            JOptionPane.showMessageDialog(this,"Fajl za pisanje podataka nije otvoren!!!","Obavestenje",JOptionPane.INFORMATION_MESSAGE);
        
        else{
            String ime, prezime, jmbg, fakultet;
            boolean zaposlen=false;
            if((ime=jTextFieldIme.getText()).compareTo("")==0){
                ime=JOptionPane.showInputDialog(this,"Niste uneli ime. Unesite ime","Obavestenje",JOptionPane.QUESTION_MESSAGE);
                jTextFieldIme.setText(ime);
            }
            if((prezime=jTextFieldPrezime.getText()).compareTo("")==0){
                prezime=JOptionPane.showInputDialog(this,"Niste uneli prezime. Unesite preezime","Obavestenje",JOptionPane.QUESTION_MESSAGE);
                jTextFieldPrezime.setText(prezime);
            }
            if((jmbg=jTextFieldJMBG.getText()).compareTo("")==0){
                jmbg=JOptionPane.showInputDialog(this,"Niste uneli jmbg. Unesite jmbg","Obavestenje",JOptionPane.QUESTION_MESSAGE);
                jTextFieldJMBG.setText(jmbg);
            }
            fakultet=jComboBox1.getSelectedItem().toString();
            
            if(jRadioButton1.isSelected()){
                zaposlen=true;
            }
            else if(jRadioButton2.isSelected())
                zaposlen=false;
            else{
                JOptionPane.showMessageDialog(this,"Niste odabrali da li je student zaposlen, automatski je postavljeno da nije!","Status studenta",JOptionPane.INFORMATION_MESSAGE);
                jRadioButton2.setSelected(true);
                zaposlen=false;
            }
            Student s=new Student(ime, prezime, jmbg, fakultet, zaposlen);
            
            jTextArea1.append(s.toString()+"\n");
            pw.println(ime);
            pw.println(prezime);
            pw.println(jmbg);
            pw.println(fakultet);
            if(zaposlen)
                pw.println("zaposlen");
            else
                pw.println("nije zaposlen");
        }
    }//GEN-LAST:event_jButtonUpisiActionPerformed

    private void jButtonProsekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProsekActionPerformed
       String jmbg=JOptionPane.showInputDialog(this,"Unesite jmbg studenta ciji prosek zelite da izracunate: ","JMBG?",JOptionPane.QUESTION_MESSAGE);
       
       for(Student s: studenti){
           if((s.getJmbg()).compareTo(jmbg)==0){
               JOptionPane.showMessageDialog(this,"Prosek studenta "+s.toString()+" je "+s.prosek(),"Status studenta",JOptionPane.INFORMATION_MESSAGE);
               break;
           }
               
       }
       
    }//GEN-LAST:event_jButtonProsekActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prozor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prozor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prozor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prozor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prozor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCitaj;
    private javax.swing.JButton jButtonCitanjeFajl;
    private javax.swing.JButton jButtonPisanjeFajl;
    private javax.swing.JButton jButtonProsek;
    private javax.swing.JButton jButtonUpisi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldJMBG;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables
}