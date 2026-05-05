
//Pedir por consola el ingreso de 
//10 números enteros positivos. 
//Contar cuántas veces se ingresaron números pares y mostrarlo por pantalla.


package java_class_bucles_04;


public class Java_class_bucles_04 {
    
    
    

    public static void main(String[] args) {
       
        
        int num = 0;
        int contador = 0;
        
    
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Dame 1 numero de los 10 que te voy a pedir: ");
            num = Utils.leerInt();
        
            if (num%2==0) {
                contador++;
            }
            
            
        } System.out.println("La cantidad de veces que tenemos par es de: " + contador);
        
        
        
    }
    
}
