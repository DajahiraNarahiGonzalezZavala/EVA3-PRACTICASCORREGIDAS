/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Narahi
 */
public class Eva3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         boolean datoErroneo = true;//el usuario siempre se equivoca
        
         
         do{
        try{
            System.out.println("Introduce tu edad en numero entero");
            int iedad = input.nextInt();
            System.out.println("Tu edad:" + iedad);
            datoErroneo = false;
            
                    

        }catch(InputMismatchException e){
            System.out.println(input.next() + " no es un numero valido");
        }
         }while(datoErroneo);
}
}
    
