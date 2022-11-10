/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.additionncimo;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class AdditionNcimo {

    public static void main(String[] args) {
        int number, result=0,i;
        do{
           number=Integer.parseInt(JOptionPane.showInputDialog("Up to what number do you want to add ")); 
        }while(number<1);

        for(i=0;i<=number;i++){
            result=result+i;  
        }
        JOptionPane.showMessageDialog(null, "The addition is: "+result);
        
    }
}
