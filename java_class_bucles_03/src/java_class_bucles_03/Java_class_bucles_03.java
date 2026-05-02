//Escribir un programa que mientras que el usuario ingrese un número entero entre 1 y 10 inclusive,
//lleve la suma de los números ingresados. 
//Finalmente, cuando sale del ciclo muestre por pantalla el resultado de la suma. ¿En qué casos termina?


package java_class_bucles_03;


public class Java_class_bucles_03 {


    public static void main(String[] args) {
      
        int numeroIng = 0;
        
        int suma = 0;
        
        System.out.println("Por favor dame un numero entre 1 y 10 ");
        numeroIng = Utils.leerInt();
        
     while((numeroIng >=1) && (numeroIng <=10)){
         suma = suma+numeroIng;
     
        System.out.println("Excelente, dame otro numero entre el 1 y el 10 ");
        numeroIng = Utils.leerInt();
        
    }
     
        System.out.println("el resultado de la suma de los numeros ingresados es: " + suma);
     
    }
    
    
    
}
