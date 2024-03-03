
package area_cuadrado;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Area_cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double lado1, lado2;
        double AreaTotal;
        
        System.out.print("Ingrese el valor de lado1...");
        lado1=datos.nextDouble();
        System.out.print("Ingrese el valor de lado2...");
        lado2=datos.nextDouble();
        
        AreaTotal=lado1*lado2;
        System.out.println("El valor del area del cuadrado es...:"+AreaTotal);
        
    }
    
}
