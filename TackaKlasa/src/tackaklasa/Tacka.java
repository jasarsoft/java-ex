
package tackaklasa;

public class Tacka {
    double x;
    double y;
    
    public Tacka(double xx, double yy){
        x=xx;
        y=yy;
    }
    
    public Tacka(){
        x=0;
        y=0;
    }
    
    public void pomjeriGore(double pomjeri){
        y+=pomjeri;
    }
    
    public void pomjeriDolje(double pomjeri){
        y-=pomjeri;
    }
    
    public void pomjeriLijevo(double pomjeri){
        x-=pomjeri;
    }
    
    public void pomjeriDesno(double pomjeri){
        x+=pomjeri;
    }
}
