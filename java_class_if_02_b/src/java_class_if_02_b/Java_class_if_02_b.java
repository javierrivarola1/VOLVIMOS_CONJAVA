
package java_class_if_02_b;


public class Java_class_if_02_b {

  
    public static void main(String[] args) {

    System.out.print("Ingrese el número de mes: ");
    int mes = Utils.leerInt(); 

    int dias = 0;

  
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        dias = 31;
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        dias = 30;
    } else if (mes == 2) {
        
        System.out.print("Ingrese el año: ");
        int anio = Utils.leerInt();
      
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            dias = 29; // Es bisiesto
        } else {
            dias = 28; // No es bisiesto
        }
    } else {
        System.out.println("Mes no válido.");
           }

    // 3. Mostrar el resultado
    System.out.println("El mes " + mes + " tiene " + dias + " días.");
}
       
    }
    

