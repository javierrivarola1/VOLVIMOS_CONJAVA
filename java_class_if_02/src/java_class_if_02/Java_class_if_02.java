
//Construir un programa que solicite desde teclado un número de
//mes y posteriormente notifique por pantalla la cantidad de días de
//ese mes. En el caso de que ingrese 2 como número de mes
//(febrero) deberá además solicitar ingresar un número de año y,
//dependiendo si es bisiesto o no


package java_class_if_02;


public class Java_class_if_02 {

    public static void main(String[] args) {
        
        int dias = 0;
        int mes = 0;
        int anio = 0;
        
        System.out.println("Por favor dame un numero para el mes: ");
         mes = Utils.leerInt();
         
         if (mes==2) {
             
             System.out.println("Por favor dame numero de anio: ");
             anio=Utils.leerInt();
             
             if (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
                 dias = 29;
             } else { dias = 28; }
            
        } else {
         
             switch(mes){
             
                 case 1: case 3: case 5: case 7: case 8: case 10: case 12: dias = 31; break;
                 case 2: case 4: case 6: case 9: case 11: dias = 30;break;
                 default: System.out.println("Pusiste un numero incorrecto ");  
             
             }
         
         }

    
    System.out.println("El mes " + mes + " tiene " + dias + " días.");
}
    
}
