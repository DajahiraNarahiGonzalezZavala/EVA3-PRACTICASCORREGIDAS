/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_mejorar_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Narahi
 */
public class Eva3_13_mejorar_captura_edad {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         boolean datoErroneo = true;
         
         
         do{
        try{
            System.out.println("Introduce tu edad en numero entero");
            int iedad = input.nextInt();
            System.out.println("Tu edad:" + iedad);
            
            
            
             if(iedad < 0)
            
            throw new Exception("El valor" + iedad + " no es una edad valida!!");
             
             datoErroneo = false;
             System.out.println("La edad ingresada es : " + iedad);
            
                    

       
        }
        
        catch(InputMismatchException r){
            System.out.println(input.next() + "no es numero valido");
        }
        catch(Exception e){
            System.out.println("Este no es numero valido");
            
        }
         }while(datoErroneo);
    
}
}