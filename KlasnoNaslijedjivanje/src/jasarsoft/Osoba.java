
package jasarsoft;

public abstract class Osoba {
    private String ime;
    private String prezime;
    private int godinaRodjenja;
    private String jmbg;

    public Osoba(String ime, String prezime, int godinaRodjenja, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.jmbg = jmbg;
    }
    
    
    public void ispisiPodatke(){
        System.out.println("Ime i prezime osobe: "+ime+" "+prezime);
        System.out.println("Godina rodjenja: "+godinaRodjenja+" jmbg: "+jmbg);
    }
    
    abstract double izracunajZaradu();
}
