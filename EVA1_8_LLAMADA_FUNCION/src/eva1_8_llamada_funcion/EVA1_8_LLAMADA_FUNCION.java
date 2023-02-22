/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_llamada_funcion;

/**
 *
 * @author carlo
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INCIA main()");
        A();//LLAMADA A FUNCION
        System.out.println("TERMINA main()");
    }

    public static void A() {

        System.out.println("INCIA A()");
        B();//LLAMADA A FUNCION
        System.out.println("TERMINA A()");

    }
    public static void B() {

        System.out.println("INCIA B()");
        System.out.println("TERMINA B()");

    }

}
