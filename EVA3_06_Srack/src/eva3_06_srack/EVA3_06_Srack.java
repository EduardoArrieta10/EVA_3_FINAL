/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_06_srack;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA3_06_Srack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Inica main");
        A();
        System.out.println("Termina main");
    
        
        
    }
    public static void A(){
        System.out.println("Inica A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inica B ");
        C();
        System.out.println("termina B");
    }
    public static void C(){
        System.out.println("Inica C");
        System.out.println("Termina C");
        //int DV = 1/0;
    }
}
