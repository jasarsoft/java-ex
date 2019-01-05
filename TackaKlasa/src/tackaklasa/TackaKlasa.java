
package tackaklasa;

public class TackaKlasa {

    public static void main(String[] args) {
        Tacka a=new Tacka();
        a.x=5;
        a.y=10;
        System.out.println("a("+a.x+", "+a.y+")");
        
        a.pomjeriDesno(5);
        System.out.println("a("+a.x+", "+a.y+")");
        
        Tacka b=new Tacka(2,4.5);
        System.out.println("b("+b.x+", "+b.y+")");
    }
    
}
