
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
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero del 6 al 10");
        int icalif = input.nextInt();
        
        System.out.println("Tu calificacion es " + CF(icalif));
        
    }
    public static String CF (int icalif){
String Calif = "";

 switch (icalif) {
     
     case 10: Calif = "A" ;break;
     case 9: Calif = "B" ;break;
     case 8: Calif = "C" ;break;
     case 7: Calif = "D" ;break;
     case 6: Calif = "F" ;break;    
 }

  return Calif ;
    
    }
}
