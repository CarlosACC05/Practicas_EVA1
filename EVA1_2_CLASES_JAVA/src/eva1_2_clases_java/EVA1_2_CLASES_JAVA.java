/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author carlo
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASE ES LA RECETA:
        //OBJETO ES EL PLATILLO
        //INSTANCIACION:
        //1. Declarar la identificador para el objeto
        //2. Asignar memoria
        //3. Invocar su contructor
        //Persona()--> contructor;
        //constructor--> método
        Persona perso1 = new Persona();
        //System.out.println(perso1);
        /*
        //ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS
        //ATRIBUTOS CON MODIFICADORES DEFAULT
        persol.nombre = "Carlos"; 
        persol.apellido = "Carrillo";
        persol.edad = 18;
        persol.estadoCivil = false; //true es casado
        
        System.out.println(perso1.nombre);*/
        perso1.setNombre("Carlos Alberto");
        //System.out.println(perso1.getNombre());
        perso1.setApellido("Carrillo Cancino");
        //System.out.println(perso1.getApellido());
        perso1.setEdad(18);
        //System.out.println(perso1.getEdad());
        perso1.setEstadoCivil(false);
        //System.out.println(perso1.getEstadoCivil());
        perso1.imprimirDatos();
        //PERSONA 2
        Persona perso2 = new Persona();
        perso2.setNombre("Agustin Daniel");
        perso2.setApellido("Gutierrez Lopez");
        perso2.setEdad(21);
        perso2.setEstadoCivil(true);
        perso2.imprimirDatos();
        
    }
    
}
