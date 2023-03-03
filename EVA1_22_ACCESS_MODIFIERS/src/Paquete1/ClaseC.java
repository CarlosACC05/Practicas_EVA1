/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author carlo
 */
public class ClaseC {

    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.defaultA; atributos visibles
        //objA.publicA;
        
        ClaseB objB = new ClaseB();
        //objB.defaultB; atributos visibles
        //objB.publicB;
                
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD; 
        
        //ClaseE esta en otro paquete y archivo
        //hay que agregar la clausula "import"       
        ClaseE objE = new ClaseE();
        //objE.publicE; solo el atributo
        
        //Clase F es default y es invisible
        //para las de este paquete 
        //ClaseF objF = new ClaseF();
    
    }
}

class ClaseD {

    public int publicD;
    int defaultD;
    private int privateD;
}
