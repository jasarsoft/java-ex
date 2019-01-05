
import static java.lang.Math.random;


public class Student {
    private String ime,prezime,jmbg,fakultet;
    private boolean zaposlen;
    private int[] ocene;

    public Student(String ime, String prezime, String jmbg, String fakultet, boolean zaposlen) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.fakultet = fakultet;
        this.zaposlen = zaposlen;
        ocene=new int[5];
        for (int i = 0; i < 5; i++) {
            ocene[i]=(int)random()*6+6;
        }
    }

    public int[] getOcene() {
        return ocene;
    }
    
    public double prosek(){
        double prosek=0;
        for (int i = 0; i < 5; i++) {
            prosek+=ocene[i]*1.0;
        }
        return prosek/5.0;
    }

    public String getJmbg() {
        return jmbg;
    }
    
    @Override
    public String toString() {
        return ime + " " + prezime + " jmbg: " + jmbg + ", fakultet: " + fakultet + ", zaposlen=" + zaposlen;
    }  
}
