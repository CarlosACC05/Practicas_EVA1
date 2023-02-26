/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author carlo
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El área del circulo es: "+area(5));
        System.out.println("El área del triangulo es: "+area(5,5));
        System.out.println("El área del trapecio es: "+area(5,5,5));
        
    }
    
    
    public static double area(double r){
    return Math.PI*Math.pow(r, 2);
    
    }
    public static double area(double b, double h){
    return (b*h)/2.0;
    
    }
    public static double area(double h, double B, double b){
    return (h*(B+b))/2.0;
    
    }
    
}
