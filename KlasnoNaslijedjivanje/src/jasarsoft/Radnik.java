
package jasarsoft;

public class Radnik extends Osoba {
    int godineStaza; 
    int nivoObrazovanja;
    
    public Radnik(String ime, String prezime, int godinaRodjenja, String jmbg, int godineStaza, int nivoObrazovanja) {        
        super(ime, prezime, godinaRodjenja, jmbg);
        this.godineStaza=godineStaza;
        this.nivoObrazovanja=nivoObrazovanja;
    }
        
    @Override
    public double izracunajZaradu(){
        double zarada=nivoObrazovanja*10000;
        int pom=godineStaza;
        
        if(pom>=5){
            while(pom>4){
                zarada+=zarada*0.05; //zarada*=1.05; zarada=zarada+(zarada/100)*5;
                pom-=5;
            }
        }
        return zarada;
    }
}
