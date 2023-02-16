package eva1_5_circulo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Atributos circuloAtrib = new Atributos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Circulo 1");
    
        System.out.print("Elige el valor de tu radio: ");
        double a = leer.nextDouble();
        
        circuloAtrib.setRadio(a); 
        circuloAtrib.setArea(0);
        circuloAtrib.setPerimetro(0);

        if(circuloAtrib.getRadio()>=0){
        System.out.println("El área del circulo es: "+circuloAtrib.getArea());
        System.out.println("El perímetro del circulo es: "+circuloAtrib.getPerimetro());
        } 
        
   
        //-------------------------------------------------------------------
        
        System.out.println("");
        System.out.println("Circulo 2");
        
        System.out.print("Elige el valor de tu radio: ");
        double b = leer.nextDouble();
        
        Atributos circuloAtrib2 = new Atributos(b,0,0);
        
        circuloAtrib2.setArea(0);
        circuloAtrib2.setPerimetro(0);
        
        if(circuloAtrib2.getRadio()>=0){
        System.out.println("El área del circulo 2 es: "+circuloAtrib2.getArea());
        System.out.println("El perímetro del circulo 2 es: "+circuloAtrib2.getPerimetro());
        } 
        
        //-------------------------------------------------------------------
        System.out.println("");
        System.out.println("Circulo 3");
        
        System.out.print("Elige el valor de tu radio: ");
        double c = leer.nextDouble();
        Atributos circuloAtrib3 = new Atributos(c,0,0);
        
        circuloAtrib3.setArea(0);
        circuloAtrib3.setPerimetro(0);
        
        if(circuloAtrib3.getRadio()>=0){
        System.out.println("El área del circulo 3 es: "+circuloAtrib3.getArea());
        System.out.println("El perímetro del circulo 3 es: "+circuloAtrib3.getPerimetro());
        } 
    }   
}
