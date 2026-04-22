
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

   if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        dias = 31;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        dias = 30;
    } else if (mes == 2) {
        
        System.out.print("Ingrese el año: ");
        anio = Utils.leerInt();

       
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            dias = 29; // Es bisiesto
        } else {
            dias = 28; 
        }
    } else {
        System.out.println("Mes no válido.");
            }

    
    System.out.println("El mes " + mes + " tiene " + dias + " días.");
}
    
}
