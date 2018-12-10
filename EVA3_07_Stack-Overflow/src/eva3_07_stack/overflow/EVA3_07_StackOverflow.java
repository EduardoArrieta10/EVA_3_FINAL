/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_07_stack.overflow;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA3_07_StackOverflow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OStackOverFlow();
    }
    //Reclusividad
    public static void OStackOverFlow(){
        System.out.println("Hola Mundo");
        OStackOverFlow();
    }
    
}
