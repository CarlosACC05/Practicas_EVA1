/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author carlo
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    
    //marca
    //modelo
    //placas
    //ano
    //dueno
    
    //-----
    //get y set
    //contructores(default y con argumentos)
    
    //calcular adeudo
    //2000 y anteriores: 2500
    //2001 - 2005: 2000
    //2006 - 2010: 2500
    //2011 - 2015: 3000
    //2016 -2023: 4000
    //imprimir datos
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil_Adeudo carro1 = new Automovil_Adeudo();
        carro1.setMarca("Toyota");
        carro1.setModelo("Prius");
        carro1.setPlacas("RHJB233");
        carro1.setAño(2012);
        carro1.setDueño("Sebas Tian");
        carro1.imprimirDatos();
        
        System.out.println("");
        
        Automovil_Adeudo carro2 = new Automovil_Adeudo("Voskwagen","Tiguan","3738HDA",2016,"Paco Lopez");
        
        carro2.imprimirDatos();
        
        
        
    }
    
}
