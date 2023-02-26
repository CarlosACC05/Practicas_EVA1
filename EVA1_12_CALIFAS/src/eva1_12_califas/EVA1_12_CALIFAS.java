/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

/**
 *
 * @author carlo
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cali;
        cali = calif(85);//almaceno el resultado en otra variable
        System.out.println("Califa para 85: " + cali);
        System.out.println("Califa para 70: "+ calif(70));//invoco dentro de otra funcion
        calif(100);//ignoro el resultado
    }

    public static String calif(int numCa) {
        String cal = "";
        if ((numCa >= 91) && (numCa <= 100)) {
            cal = "A";
        } else if ((numCa >= 81) && (numCa <= 90)) {
            cal = "B";
        } else if ((numCa >= 71) && (numCa <= 80)) {
            cal = "C";
        } else {
            cal = "D";
        }
        return cal;
       /*   
        if ((num >= 91) && (num <= 100)) {
            return "A";
        } else if ((num >= 81) && (num <= 90)) {
            return "B";
        } else if ((num >= 71) && (num <= 80)) {
            return "C";
        } else {
           return "D";
        }*/ 
        
        
    }
}
