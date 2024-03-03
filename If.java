
package Condicional_if;

import javax.swing.JOptionPane;


public class If {

    
    public static void main(String[] args) {
        int Num1, Num2;
        
        Num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        Num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        if(Num1>Num2){
            JOptionPane.showMessageDialog(null,"El numero mayor es...:"+Num1);
            JOptionPane.showMessageDialog(null,"El numero menor es...:"+Num2);
            
        }else{
            JOptionPane.showMessageDialog(null,"El numero menor es...:"+Num1);
            JOptionPane.showMessageDialog(null,"El numero mayor es...:"+Num2);
        }
    }
    
}
