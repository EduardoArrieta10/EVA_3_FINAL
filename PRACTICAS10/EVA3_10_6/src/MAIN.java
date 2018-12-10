
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
        int an = input.nextInt();
        System.out.println(FUN(an));
    }
    public static String FUN(int an){
        String ao = "";
        if((an%4 == 0) && ((an%100 !=0) || (an%400 ==0))){
        ao = "Es isiesto";
        return ao;
        } else 
            ao = "No es bisiesto";
    return ao; }
           
    }


