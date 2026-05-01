//Escribir un programa que mientras el usuario ingrese un número
//entero menor que 100 y mayor a 1, muestre por pantalla si el
//número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
//valores mencionados en el enunciado deberían ser constantes?.
//De a poco habría que definirlos como constantes).



package java_class_bucles_01;


public class Java_class_bucles_01 {


    public static void main(String[] args) {
        
      final int minimo = 1;
      final int maximo = 100;
      final int divisor_a = 2;
      final int divisor_b = 3;
      int ingresado = 0;
        
        System.out.println("Por favor ingresa un numero: ");
        
        ingresado = Utils.leerInt();
        
        while((ingresado<maximo) && (ingresado > minimo)) {
        
            if ((ingresado % divisor_a == 0) && (ingresado % divisor_b == 0 )){
                
                System.out.println("El ingresado es multiplo de ambos y el numero que eligiste es: " + ingresado);
            } else {
            
                System.out.println("ingresa otro numero por favor: ");
               
                            }
            
                System.out.println("Ingresa otro numero (o uno fuera de rango para salir): ");
                ingresado = Utils.leerInt();
                               
        }
        
        System.out.println("FINALIZADO PORQUE NO CUMPLE CON EL PRIMER REQUISITO");
    }
    
}
