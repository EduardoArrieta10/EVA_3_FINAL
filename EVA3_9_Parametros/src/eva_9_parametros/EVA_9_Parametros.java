/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_parametros;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA_9_Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new EVA_9_Parametros());
        int x;
        EVA_9_Parametros OBJ = new EVA_9_Parametros();
        System.out.println(OBJ);
        UCLS OBJ2 = new UCLS();
        int VAL = 5;
        Incrementa(VAL);
        System.out.println("El Valor es " + VAL);
        //
        //Valor OBJ
        
    }
    public static void Incrementa(int VAL){ 
        
        VAL++;
    }
      public static void Incrementa(Valor EVAL){ 
        
        //EVAL++;
    }
    }
    

class Valor {
    
    
}
class UCLS {
    
    
}
