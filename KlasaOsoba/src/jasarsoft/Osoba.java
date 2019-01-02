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
public class Osoba {
    private String ime, prezime, jmbg;
    
    public Osoba(){
        ime="NN";
        prezime="NN";
        jmbg="-";
    }

    public Osoba(String ime, String prezime, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }
    
    
    
    public String getIme(){
        return ime;
    }
    public void setIme(String novoIme){
        ime=novoIme;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    public void odstampaj(){
        System.out.println("Osoba: "+ime+" "+prezime+", jmbg "+jmbg);
    }
}
