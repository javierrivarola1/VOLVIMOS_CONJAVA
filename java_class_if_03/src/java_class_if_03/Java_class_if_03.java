
//Escribir un programa que solicite el ingreso de un número mayor a
//50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3, sino
//muestre un mensaje que informe dicha situación

package java_class_if_03;

import java.util.Scanner;


public class Java_class_if_03 {

    public static void main(String[] args) {
        
        int resultado = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor dame un numero: ");
        
       resultado = teclado.nextInt();
       
        if ((resultado > 50)) {
            
            if ((resultado%2==0) && (resultado%3==0)) {
                
                System.out.println("Tu resultado es: " + resultado);
            }
        } else {
        
            System.out.println("No esta cumpliendo con que sea mayor a 50 ");
        }
        
    }
    
}
