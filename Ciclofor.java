
package ciclofor;

import javax.swing.JOptionPane;
public class Ciclofor {

    
    public static void main(String[] args) {
        int oper1;
        
        oper1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la tabla que desea"));
        int oper2=1;
        while(oper2<=10){
            JOptionPane.showMessageDialog(null,oper1 + "X" + oper2 + "=" + oper1*oper2);
            oper2++;
        }
        for(oper2 = 1; oper2 <=10; oper2++){
            System.out.println(oper1 + "X" + oper2 + "=" + oper1*oper2);
        }
    }
    
}
