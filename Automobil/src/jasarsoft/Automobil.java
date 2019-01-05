/*
Napisati klasu Automobil koja sadrži atribute marka, model, godinaProizvodnje, brojRegistracije i kubikaža. 
Klasa sadrži i metode ispisiPodatke, promeniBrojRegistracije, prveriRegistraciju 
koji proverava da li je registracija počinje sa dva velika slova, da li nakon toga slede tri broja i na kraju dva slova. 
Klasa ima i dva kontruktora, sa i bez argumenata (podrazumjevani i za dodjelu vrijednosti). 
Svi atributi klase su privatni i potrebno je obezbjediti mogućnost čitanja i izmjene svih atributa.
*/

package jasarsoft;

public class Automobil {

    private String marka;
    private String model;
    private int godinaProizvodnje;
    private String brojRegistracije;
    private int kubikaza;

    public Automobil(){
        marka="";
        model="";
        godinaProizvodnje=0;
        brojRegistracije="";
        kubikaza=0;
    }

    public Automobil(String marka, String model, int godinaProizvodnje, String brojRegistracije, int kubikaza) {
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojRegistracije = brojRegistracije;
        this.kubikaza = kubikaza;
    }

    public String getMarka(){
        return marka;
    }

    public void setMarka(String marka){
        this.marka=marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getBrojRegistracije() {
        return brojRegistracije;
    }

    public void setBrojRegistracije(String brojRegistracije) {
        this.brojRegistracije = brojRegistracije;
    }

    public int getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }   


    public void ispisiPodatke(){
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("proizveden: "+godinaProizvodnje);
        System.out.println("Registracija: "+brojRegistracije);
        System.out.println("Kubikaza: "+kubikaza);
    }

    public void promeniBrRegistracije(String noviBr){
        brojRegistracije=noviBr;
    }

    public boolean provjeriRegistraciju(){
        boolean ispravna=false;

        if(brojRegistracije.length()==7){
            if(Character.isUpperCase(brojRegistracije.charAt(0)) && Character.isUpperCase(brojRegistracije.charAt(1)) && Character.isDigit(brojRegistracije.charAt(2)) && Character.isDigit(brojRegistracije.charAt(3)) && Character.isDigit(brojRegistracije.charAt(4)))
                if(Character.isLetter(brojRegistracije.charAt(5)) && Character.isLetter(brojRegistracije.charAt(6)))
                    ispravna=true;
        }

        return ispravna;
    }
}
