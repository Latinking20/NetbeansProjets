
package area_rectangulo;

import java.util.Scanner;


public class Area_rectangulo {

    
    public static void main(String[] args) {
        double base, altura;
        double AreaTotal;
        Scanner datos = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el valor de la base..");
        base=datos.nextDouble();
        System.out.print("Ingrese el valor de la altura..");
        altura=datos.nextDouble();
        
        // Salida de datos
        
        AreaTotal=base*altura;
        System.out.println("El valor del area del rectangulo es....:"+AreaTotal);
       
        
    }
    
}
