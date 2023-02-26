/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_alcance_2;

/**
 *
 * @author carlo
 */
public class EVA1_14_ALCANCE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=100;//visible dentro de todo el bloque main();
        
        
        for (int i = 0; i < 10; i++) {
            int x=100;//la variable esta declarada en main();
                      //es visible dentro dle for
            int y=100;//visible dentro del for       
            if (i == 5) {

            }
        }
        int y=100;//aqui la variable "y" del ciclo for no existe
                  // podemos declarar una variable del mismo nombre 
    }

}
