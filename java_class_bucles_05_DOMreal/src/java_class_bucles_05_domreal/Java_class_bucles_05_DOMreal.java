//Implementar un juego de adivinación en el que la computadora “piense” un número entre 0 y 99 
//(puede usar la siguiente sentencia: int numeroSecreto = (int)(Math.random() * 1000) % 100;) 
//y el usuario intente adivinarlo. El usuario deberá ingresar un número por teclado y el juego deberá responder si
//acertó o no. En caso de no acertar, el juego deberá indicar si el número ingresado es menor o mayor 
//al número secreto. Este proceso continuará hasta que el usuario acierte. 
//Al finalizar, el juego deberá informar la cantidad de intentos que le llevó al jugador acertar el número.


package java_class_bucles_05_domreal;


public class Java_class_bucles_05_DOMreal {

 
    public static void main(String[] args) {
        
     int numeroSecreto = (int)(Math.random() * 1000) % 100;
     int intentos = -1;
     int contador = 0;
        
        
       while(intentos!=numeroSecreto) {
       
          System.out.println("Por favor dame un numero del 0 al 99: ");
          intentos = Utils.leerInt();
          
        contador++;
        
           if (intentos==numeroSecreto) {
               System.out.println("lo lograste, ganaste ! ");
           } else if(intentos<numeroSecreto) {
           
               System.out.println("Es mayor, intentalo de vuelta ");
           } else {System.out.println("Es menor, intentalo de vuelta ");}
          
              
       }
       
        System.out.println("Ganaste y la cantidad de intentos fueron estos: " + intentos);
            
        
        
    }
    
}
