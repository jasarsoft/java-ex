
package jasarsoft;

public class KlasnoNaslijedjivanje {

    public static void main(String[] args) {
        
        Radnik pera=new Radnik("Pera", "Zikic", 1970, "222838432", 12, 3);
        Radnik zika=new Radnik("Zika", "Peric", 1990, "231253113", 4, 1);
        Radnik mika=new Radnik("Mika", "Peric", 1987, "231253113", 7, 2);
        
        pera.ispisiPodatke();
        zika.ispisiPodatke();
        mika.ispisiPodatke();
        
        System.out.println("Zarada pere: "+pera.izracunajZaradu());
        System.out.println("Zarada zike: "+zika.izracunajZaradu());
        System.out.println("Zarada mike: "+mika.izracunajZaradu());
    }
    
}
