/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Juego {
    
    public void adivinar(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Numero a adivinar"));
        int conta =0;
                while(num>=1&&num<=50&&conta<6){
            int num2= Integer.parseInt(JOptionPane.showInputDialog("Prueba un numero"));
            
           if (num2<num){
               System.out.println("Es mayor");               
           }
           else if(num2>num){
               
               System.out.println("Es menor");
           }
           else if(num2==num){
               System.out.println("Has acertado");
               break;
           }
            
           
           conta++;
           
        }
    }
}
