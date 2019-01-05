/*
Napisati klasu Student koja nasleđuje klasu Osoba i 
sadrži privatne atribute brojIndeksa, godinaStudija i atribut fakultet koji je zajednički za sve objekte klase. 
Klasa Student sadrži i nadjačani metod ispisiPodatke() i podrazumevani konstruktor i konstruktor za dodelu vrednosti. 
Za sve atribute potrebno je napisati get i set metode.
*/
package jasarsoft;

/**
 *
 * @author jasarsoft
 */
public class Student extends Osoba {
    private String brIndeksa;
    private int godinaStudija;
    private String fakultet;

    public Student(String brIndeksa, int godinaStudija, String fakultet, String ime, String prezime, String jmbg) {
        super(ime, prezime, jmbg);
        this.brIndeksa = brIndeksa;
        this.godinaStudija = godinaStudija;
        this.fakultet = fakultet;
    }

    public Student() {
    }
    
    @Override
    public void ispisiPodatke(){
        super.ispisiPodatke();
        System.out.println("Indeks: "+brIndeksa+" godina studija: "+godinaStudija+", fakultet: "+fakultet);
    }
}
