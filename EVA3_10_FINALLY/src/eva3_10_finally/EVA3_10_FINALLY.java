/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Narahi
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       
       try{
        System.out.println("Introduce un dato entero");
        int valor = entrada.nextInt();
        System.out.println("El valor es " + valor);
            
        
    
    }catch(InputMismatchException e){
        e.printStackTrace();
        
        
    }finally{
       
        System.out.println("Esta linea siempre debe ejecutarse");
       }
        System.out.println("fin del programa");
}
}
