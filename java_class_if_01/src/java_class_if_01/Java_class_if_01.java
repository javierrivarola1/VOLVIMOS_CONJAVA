
package java_class_if_01;

import java.util.Scanner;


public class Java_class_if_01 {


    public static void main(String[] args) {
        
        final int MAXIMO = 100;

        int respuesta1;

        int respuesta2;

        int respuesta3;
        
        char respuesta4;
        
        int respuesta5a;
        
        int respuesta5b;
        
        int respuesta5c;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("por favor ingresar un numero: ");

        respuesta1 = teclado.nextInt();

        if ((respuesta1 >= 1) || (respuesta1 <= -1)) {

            System.out.println("Es positivo: " + respuesta1);

        } else {
            System.out.println("Es negativo: " + respuesta1);

        }

        System.out.println("Dame otro numero: ");

        respuesta2 = teclado.nextInt();

        if (respuesta2 > MAXIMO) {
            System.out.println("GRANDE");
        } else {
            System.out.println("CHICO");}
            
            System.out.println("Brindame un numero del 1 al 7");
            
            respuesta3 = teclado.nextInt();
            
            switch(respuesta3){
                case 1: System.out.println("Lunes");break;
                case 2:System.out.println("Martes");break;
                case 3: System.out.println("Miercoles");break;
                case 4: System.out.println("Jueves");break;
                case 5: System.out.println("Viernes");break;
                case 6: System.out.println("Sabado");break;
                case 7: System.out.println("Domingo");break;
                
                default: System.out.println("No es un numero del 1 al 7");
            
            } 
            
            System.out.println("Por favor dame una letra: ");
            respuesta4 = teclado.next().charAt(0);
            
            switch(respuesta4){
                case 'a': System.out.println("Es vocal");break;
                case 'e': System.out.println("Es vocal");break;
                case 'i': System.out.println("Es vocal");break;
                case 'o': System.out.println("Es vocal");break;
                case 'u': System.out.println("Es vocal");break;
                
                default: System.out.println("Es consonante");
                
            }
            
            System.out.println("Dame el primero numero: ");
            
            respuesta5a = teclado.nextInt();
            
              System.out.println("Dame el segundo numero: ");
            
            respuesta5b = teclado.nextInt();
            
              System.out.println("Dame el tercer numero: ");
            
            respuesta5c = teclado.nextInt();
            
            if ((respuesta5a < respuesta5b) && (respuesta5b < respuesta5c)) {
            
                System.out.println("Esta en formato creciente");
                
        } else if((respuesta5a > respuesta5b) && (respuesta5b > respuesta5c)){
        System.out.println("Esta en formato decreciente");
        } else { System.out.println("No tiene ningun formato ");
                }
        }
    
}
