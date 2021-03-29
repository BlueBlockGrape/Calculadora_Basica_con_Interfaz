/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author esaar
 */
public class Operaciones {
    
    public boolean error = false;
    
    public float operación(char operador, float num1, float num2){
       float respuesta=0;
       
        switch(operador)
            {
                case '+':
                    respuesta= num1+num2;
                    break;
                case '-':
                    respuesta= num1-num2;
                    break;
                case '*':
                    respuesta= num1*num2;
                    break;
                    
                case '/':
                    if(num2 == 0){
                        respuesta = 0;
                        JOptionPane.showMessageDialog(null, "Error", "División entre 0", JOptionPane.WARNING_MESSAGE);
                        error= true;
                    }else{
                        respuesta= num1/num2; 
                    }
                    break;
            }
        
        return respuesta;
   }
}
