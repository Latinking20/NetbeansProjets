
package Condicional_if;

import java.util.Scanner;


public class Condicional_if {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Boolean True = null;
        
        Boolean condicion=True, False;
        int Num1, Num2;
        System.out.print("Ingrese el prime numero...:");
        Num1=datos.nextInt();
        System.out.print("Ingrese el segundo numero....:");
        Num2=datos.nextInt();
        
        if (Num1>Num2) {
            System.out.println("El numero mayor es...:"+Num1);
        }else if(Num2>Num1){
            System.out.println("El numero mayor es...:"+Num2);
        }else{
            System.out.println("Son iguales...");
        }
        
        if(Num1==Num2){
            System.out.println("Los numeros son iguales");
        }else if(Num1>Num2){
            System.out.println("El numero mayor es el primero y su valor es...:"+Num1);
        }else{
            System.out.println("El numero mayor es el segundo y su valor es...:"+Num2);
        }
        
        
    }
    
}
