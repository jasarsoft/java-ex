/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasarsoft;

/**
 *
 * @author jasarsoft
 */
public class Trougao {
    private double a, b, c; //duzine stranica drougla

    //KONSTRUKTORI
    public Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Trougao(){
        a=0;
        b=0;
        c=0;
    }
    
    //GET/SET METODE

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public void stampaj(){
        System.out.println("Trougao sa stranicama: "+a+", "+b+", "+c);
    }
    
    public double obim(){
        return a+b+c;
    }
    
    public double povrsina(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
