/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author carlo
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*final int x;
        x = 100;
        x = 200;*/
        FormulasGeometria formulas = new FormulasGeometria();
        //formulas. no existe ningun metodo dentro del objeto
        System.out.println("MI PI: "+FormulasGeometria.PI);
        System.out.println("Area triangulo: "+ FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+ FormulasGeometria.volumenEsfera(10));
    }

}
