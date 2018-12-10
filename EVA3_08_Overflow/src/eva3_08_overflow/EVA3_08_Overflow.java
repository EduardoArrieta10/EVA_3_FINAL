/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_08_overflow;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA3_08_Overflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new EVA3_08_Overflow());
        
        System.out.println(suma(5,8));
        System.out.println(suma("Hola"," Mundo"));
    }
    public static int suma(int VAL, int VAL2){
    return VAL + VAL2;
    }
    
    
    public static String suma(String CAD, String CAD2){
    return CAD + CAD2;
    
    }
   
}


