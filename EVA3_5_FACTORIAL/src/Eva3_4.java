/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Arrieta
 */
public class Eva3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int ival = 5;
        
        System.out.println("Resultado "+ calcularFactorial (ival));
    }
    public static int calcularFactorial(int ival){
        int iResu = 1;
        for (int i = ival; i >= 1; i--) {
            iResu *= i;
            
            
        }
        return iResu;
    }
}
