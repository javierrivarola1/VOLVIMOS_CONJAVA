//Escribir un programa que mientras el usuario ingrese un caracter
//distinto del caracter ‘*’, muestre por pantalla si es carácter dígito, o
//si es carácter vocal minúscula. Cuando ingrese ‘*’ debe terminar.



package java_class_bucles_02;


public class Java_class_bucles_02 {


    public static void main(String[] args) {
        
        char caracter;
        
        System.out.println("Por favor dame un caracter: ");
        caracter = Utils.leerChar();
        
        while(caracter != '*') {
        
            switch (caracter) {
            
                case 'a': System.out.println("Me pusiste la vocal: " + caracter);break;
                case 'e': System.out.println("Me pusiste la vocal: " + caracter); break;
                case 'i': System.out.println("Me pusiste la vocal: " + caracter);break;
                case 'o': System.out.println("Me pusiste la vocal: " + caracter);break;
                case 'u': System.out.println("Me pusiste la vocal: " + caracter);break;
                
                default: System.out.println("Es caracter digito es: " + caracter);
                
            
            }
            
            System.out.println("Por favor dame otro caracter: ");
            caracter = Utils.leerChar();
        
        
        }    
        
        System.out.println("Has ingresado el caracter: " + caracter + " " + "se cierra el sistema");
        
        
    }
    
}
