
package jasarsoft;

public class Stan {
    private String adresa;
    private int broj, brojSoba, kvadratura;

    public Stan(String adresa, int broj, int brojSoba, int kvadratura) {
        this.adresa = adresa;
        this.broj = broj;
        this.brojSoba = brojSoba;
        this.kvadratura = kvadratura;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public int getBrojSoba() {
        return brojSoba;
    }

    public void setBrojSoba(int brojSoba) {
        this.brojSoba = brojSoba;
    }

    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }
    
    public int cenaStana(){
        return brojSoba*kvadratura*1000;
    }
}
