
package area_rectangulo;

import javax.swing.JOptionPane;


public class Area_rectanguloG {

    
    public static void main(String[] args) {
        
        double base, altura;
        double AreaTotal;
        
        base=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de la base.."));
        altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de la altura.."));
        
        AreaTotal=base*altura;
        JOptionPane.showMessageDialog(null,"El valor del area del rectangulo es...:"+AreaTotal);
    }
    
}
