/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_alcance;

/**
 *
 * @author carlo
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 100;//visible para todo lo que este
        //dentro de main()

        for (int i = 0; i < 10; i++) {//inicio del bloque for

            System.out.println("x = " + x);//visible dentro del for

            System.out.println("i = " + i);

            System.out.println("j = " + j);//variable no es visible
            //no esta declarada antes
            //la instruccion
            int j = 100;//apartir de aqui, es visible

            System.out.println("i = " + i);
            System.out.println("j = " + j);

            {
                int z = 1000;
                System.out.println("z= " + z);
            }
            System.out.println("z= " + z);
        }//termina bloque for

        //no estan declaradas en el bloque
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    public static void algo() {

        System.out.println("x = " + x);//no es visible en algo()

    }
}
