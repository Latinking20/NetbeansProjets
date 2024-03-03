
package area_cuadrado;

import javax.swing.JOptionPane;


public class Area_grafica {

    
    public static void main(String[] args) {
        double lado1, lado2;
        double AreaTotal;
        
        lado1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el valor del lado1..."));
        lado2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor del lado2..."));
        
        AreaTotal=lado1*lado2;
        JOptionPane.showMessageDialog(null,"El area total del cuadrado es...:"+AreaTotal);
    }
    
}
