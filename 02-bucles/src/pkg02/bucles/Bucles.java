package pkg02.bucles;

import javax.swing.JOptionPane;

 /*
    “Construye un programa que, al recibir como dato un número entero positivo, escriba una figura como la que se muestra a continuación (ejemplo para N = 6):

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1”
*/
public class Bucles {
    public static void main(String[] args) {
        int numero, contador, contador2;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a evaluar"));
            if(numero <= 0){
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a cero");
            }else{
                //JOptionPane.showMessageDialog(null, "Numero: "+numero+" (Almacenado correctamente)");
                for(contador=1; contador<=numero; contador++){;
                    for(contador2=1; contador2<=contador;contador2++){
                        System.out.print(contador2+" ");
                    }
                    System.out.println("");
                }
                for(contador=(numero-1); contador >= 1; contador--){
                    for(contador2=1; contador2<=contador;contador2++){
                        System.out.print(contador2+" ");
                    }
                    System.out.println("");
                }
            }
        }while(numero <= 0);
        
    }
    
}
