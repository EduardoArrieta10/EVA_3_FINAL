
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Herrera 17061048
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la letra de la calificacion");
        String Scalif = input.nextLine();
        
        System.out.println("Tu calificacion es " + CF(Scalif));
        
    }
    public static int  CF (String Scalif){
int califconv = 1;

 switch (Scalif) {
     
     case "A": califconv = califconv * 10 ;break;
     case "B": califconv = califconv * 9 ;break;
     case "C": califconv = califconv * 8 ;break;
     case "D": califconv = califconv * 7 ;break;
     case "F": califconv = califconv * 6 ;break;    
 }

  return califconv ;
    
    }
}
