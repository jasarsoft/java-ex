/*
Napisati klasu Osoba koja sadrži atribute ime, prezime, jmbg; 
metode ispisiPodatke() i proveriJmbg() kao i podrazaumevani konstruktor i konstruktor za inicijalizaciju objekta. 
Matični broj je ispravan ako je dužina 13 i svi karakteri su brojevi.
*/
package jasarsoft;


public class Osoba {
    private String ime;
    private String prezime;
    private String jmbg;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }   
    
    
    public void ispisiPodatke(){
        System.out.println("Ime i prezime:"+ime+" "+prezime+" jmbg: "+jmbg);
    }
    
    public boolean proveriJmbg(){
        if(jmbg.length()!=13)
            return false;
        for (int i = 0; i < 13; i++) {
            if(!Character.isDigit(jmbg.charAt(i)))
                return false;
        }
        
        return true;
    }
}
