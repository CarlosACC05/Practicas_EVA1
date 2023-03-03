/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static;

/**
 *
 * @author carlo
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI: "+Math.PI);
        System.out.println("Numero aleatorio: "+Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        Saludo2();//SI NO ES ESTATICO, Y NO SE HA CREADO
                  //UN OBJETO, EL METODO NO EXISTE
        
    }
    public void Saludo2(){
        System.out.println("HOLA");
    
    }
}

class Utilerias {

    public void Saludo() {
    //Saludo():ESTE METODO EXISTE HASTA QUE SE CREA OTRO OBJETO DE LA CLASE
    //CLASE. SOLO SE USA A TRAVES DE UN OBJETO
        System.out.println("Hola!!!");
    }
    //otroSaludo(): ESTE METODO EXISTE EN EL MOMENTO QUE EL PROGRAMA 
    //INICIA SU EJECUCION. NO NECESITA QUE SE CREE UN OBJETO DE LA
    //CLASE PARA PODERLO UTILIZAR. SE USA ATRAVES DE LA CLASE
    public static void otroSaludo() {
        System.out.println("Otro saludo(static)");
    }

}

class OtraClase{

}
