
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
        
        System.out.println("Ingresa tu edad ");
        System.out.println("Tu edad es "+ EDA(1));
         System.out.println("Ingresa tu nombre ");
        System.out.println("Tu nombre es "+ EDA(""));
         System.out.println("Valor boleano "+ EDA(true));
         System.out.println("Ingresa tu estatura");
         System.out.println("Tu estatura es " +EDA (0.5));
         
    }
    public static int EDA(int inum){
        Scanner input = new Scanner(System.in);
        inum = input.nextInt();
        
        
    return inum;
    
    }
        public static String EDA(String inum){
        Scanner input = new Scanner(System.in);
        inum = input.nextLine();
        
        
    return inum;
    
    }
         public static boolean EDA(boolean inum){
        Scanner input = new Scanner(System.in);
        inum = true;
        
        
    return inum;
    
    } public static double EDA(double inum){
        Scanner input = new Scanner(System.in);
        inum = input.nextDouble();
        
        
    return inum;
    
    }
}
