
package jasarsoft;

public class AutomobilClass {
    
    public static void main(String[] args) {
        Automobil a1=new Automobil();
        a1.ispisiPodatke();
        
        a1.setBrojRegistracije("AA123bg");
        a1.setGodinaProizvodnje(2000);
        a1.setKubikaza(100);
        a1.setMarka("Zastava");
        a1.setModel("Yugo");
        
        a1.ispisiPodatke();
        if(a1.provjeriRegistraciju()) System.out.println("registracija "+a1.getBrojRegistracije()+" je ispravna");
        else System.out.println("Neispravna reg");
        
        Automobil a2=new Automobil("Audi", "A", 1998, "12AAbE3", 700);
        a2.ispisiPodatke();
        
        if(a2.provjeriRegistraciju()) System.out.println("registracija "+a1.getBrojRegistracije()+" je ispravna");
        else System.out.println("Neispravna reg");
        
        a2.promeniBrRegistracije("BG123hh");
        if(a2.provjeriRegistraciju()) System.out.println("registracija "+a1.getBrojRegistracije()+" je ispravna");
        else System.out.println("Neispravna reg");
    }
}
