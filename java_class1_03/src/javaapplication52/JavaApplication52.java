//Escribir un programa que permita el ingreso de un número entero
//por teclado e imprima el resultado de determinar:
//a. si es múltiplo de 6 y de 7,
//b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
//c. si el cociente de la división de dicho número por 5 es mayor
//que 10.



package javaapplication52;

import java.util.Scanner;


public class JavaApplication52 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Por favor bridame un numero: ");
        
        int respuesta = leer.nextInt();
                
        //Parte A del ejercicio
        
        boolean esCorrectoA = (respuesta % 6 == 0) && (respuesta % 7 == 0);
        System.out.println("Es correcto y es multiplo " + esCorrectoA);
        
        //parte B del ejercicio
        boolean esCorrectoB = (respuesta > 30) && (respuesta % 2 == 0) || (respuesta <= 30);
        System.out.println("Si, cumple con esas cualidades " + esCorrectoB);
        
        //parte C del ejercicio
        int conciente = respuesta / 5;
        boolean esCorrectoC = respuesta > 10;
        
        System.out.println("Tambien cumple con ese requisito: " + esCorrectoC);
        
        
        
    }
    
}
