/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Narahi
 */
public class Eva3_8_multiples_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
      
        
        try{
             System.out.println("Introduce tu edad en numero entero");
            int entero = input.nextInt();
        
            System.out.println("Introduce tu edad en numero entero 2");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero/entero2));
        
        }catch(ArithmeticException e){
            System.out.println("Se produjo un error");
        }
        catch(InputMismatchException i){
                    System.out.println("El valor capturado no es valido");
                    }
        
    }
    
}
