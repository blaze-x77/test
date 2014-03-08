/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author 1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              
         int vector[]= new int[5];
int Numero; //1
for(int i=0; i < vector.length;i++){ //2
  Numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));//3
    if(Numero>8){//4
     vector[i]= Numero;//5
    }else{//6
        JOptionPane.showInputDialog("No debe ingresar numeros menores que 8");//7
        
      }//8
    }

for(int i=0;i < vector.length;i++){//9
    System.out.println("El numero ingresado en el vector fue:"+vector[i]);//10
}
System.exit(0);//10
        
        
        
        
        
        
    }
    
