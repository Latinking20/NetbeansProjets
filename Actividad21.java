/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Actividad21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int Num1=0, Num2=0, Num3=0, Totalsuma, Totalproducto;
        System.out.println("Este es el algoritmo de la suma y multiplicacion de 3 numeros");
        
        System.out.print("Ingrese el valor del numero 1...");
        Num1=datos.nextInt();
        System.out.print("Ingrese el valor del numero 2...");
        Num2=datos.nextInt();
        System.out.print("Ingrese el valor del numero 3...");
        Num3=datos.nextInt();
        
        Totalsuma=Num1+Num2+Num3;
        Totalproducto=Num1*Num2*Num3;
        System.out.println("La suma total de los e numeros es..."+Totalsuma);
        System.out.println("El producto total de los 3 numeros es..."+Totalproducto);
    }
    
}
