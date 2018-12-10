
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Arrieta
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int NumPrim;
        System.out.println("Ingresa un numero");
        NumPrim = input.nextInt();
       if (CN(NumPrim)){
           System.out.println(CN(NumPrim));
           System.out.println("Es primo");
       }
       else 
            System.out.println("No es primo");
        
    }
    public static boolean CN (int NumPrim){
       boolean sies = false; 
    if (NumPrim%2==0) return sies;

    for(int i=3;i*i<=NumPrim;i+=2) {
        if(NumPrim%i==0)
            return sies;
    }
    sies = true;
    return sies;
    }
        
  
    
}
