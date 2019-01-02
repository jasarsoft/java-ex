
package jasarsoft.jedinice;

public class Lokacija {
    private Duzina x, y;
    
    public Lokacija(Duzina x, Duzina y) {
        this.x = x;
        this.y = y;
    }
    
    public Duzina getX() {
        return x;
    }
    
    public Duzina getY() {
        return y;
    }
    
    public void move(Ugao ugao, Duzina duzina) {
        //x' = x + duzina * cos(ugao);
        //y' = y + duzina * sin(ugao);
        
        x.addMetri((Duzina.fromMetri(duzina.toMetri() * Math.cos(ugao.toRadijani()))).toMetri());
    }
}
