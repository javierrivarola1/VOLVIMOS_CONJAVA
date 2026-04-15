//Escribir un programa que dado tres números reales ingresados
//por el usuario, divida el primero por el segundo y al resultado
//obtenido le reste el tercero. Muestre por pantalla el resultado
//obtenido. Puede o no usar variables auxiliares para los cálculos.
//¿Puede ocurrir algún error?


package java_class1_04;

import java.util.Scanner;


public class Java_class1_04 {


    public static void main(String[] args) {
        
        double respuesta1;
        double respuesta2;
        double respuesta3;
        double primerCalculo;
        double total;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un numero: ");
        
        respuesta1 = teclado.nextDouble();
        
        System.out.println("Dame el 2do numero: ");
        
        respuesta2 = teclado.nextDouble();
        
        System.out.println("Dame el 3er numero: ");
        
        respuesta3 = teclado.nextDouble();
        
        primerCalculo = respuesta1 / respuesta2;
        total = primerCalculo - respuesta3;
        
        System.out.println("Dame el total: " + total);
              
       
    }
    
}
