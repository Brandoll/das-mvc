package mvc01;

import javax.swing.JOptionPane;
public class Validacion {
    public boolean   checkDouble(String entrada){
        boolean valido = false;
       double x = 0.0;
        try{
            x = Double.parseDouble(entrada);
            valido = true;
        }
         catch (NumberFormatException nfe) {
               this.showError("Error: No es cifra");
         }
               return valido;
    }
        
  public void showError(String s) {
        JOptionPane.showMessageDialog(null,s);
    }    
}
