
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
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa El Numero Del Mes");
        int inum = input.nextInt();
        
        System.out.println("El mes es "+Mes(inum));
        
    }
    public static String  Mes(int inum){
String Nmes = "";

 switch (inum) {
     
     case 1: Nmes = "Enero";
     break;
     case 2: Nmes = "Febrero";
     break;
     case 3: Nmes = "Marzo";
     break;
     case 4: Nmes = "Abril";
     break;
     case 5: Nmes = "Mayo";
     break;
     case 6: Nmes = "Junio";
     break;
     case 7: Nmes = "Julio";
     break;
     case 8: Nmes = "Agosto";
     break;
     case 9: Nmes = "Septiembre";
     break;
     case 10: Nmes = "Octubre";break;
     case 11: Nmes = "Noviembre";break;
     case 12: Nmes = "Diciembre";break;
 }

  return Nmes ;
    
    }
}
