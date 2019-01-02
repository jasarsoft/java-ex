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
public class TrougaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trougao t1=new Trougao(3,4,5);
        t1.stampaj();
        
        System.out.println("P="+t1.povrsina());
        System.out.println("O="+t1.obim());
        
        t1.setA(5);
        t1.stampaj();
        
        System.out.println("Stranica a="+t1.getA());
    }
    
}
