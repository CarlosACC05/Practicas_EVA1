/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_static_2;

/**
 *
 * @author carlo
 */
public class FormulasGeometria {
    //CONSTANTE
    public static final double PI = 3.14159;
    //area triangulo
    public static double areaTriangulo(double base, double altura){
    return (base*altura)/2;
    }
    //area circulo
    public static double areaCirculo(double radio){
    return PI*radio*radio;
    }
    
    //perimetro circulo
    public static double perimetroCirculo(double radio){
    return PI*(radio*2);
    }
    
    //volumen
    public static double volumenEsfera(double radio){
    return (4.0/3.0)*PI*(radio*radio*radio);
    }
}
