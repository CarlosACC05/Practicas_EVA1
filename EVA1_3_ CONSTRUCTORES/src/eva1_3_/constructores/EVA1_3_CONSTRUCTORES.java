/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_.constructores;

/**
 *
 * @author carlo
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria("2", 90000000, "Yisus");
        
        //cuenta1.setNomCliente("Carlos Carrillo");
        //cuenta1.setNumCuenta("1");
        //cuenta1.setSaldo(40000000);
        
        System.out.println("DATOS DEL CLIENTE: ");
        
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        
        //cuenta1.imprimirDatos();
        System.out.println(" ");
        //-----------------------------
        CuentaBancaria cuenta2 = new CuentaBancaria("3", 700, "Juan Lopez");
        
        System.out.println("DATOS DEL CLIENTE: ");
        
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
        
        System.out.println(" ");
        //-----------------------------
        CuentaBancaria cuenta3 = new CuentaBancaria();
         
        System.out.println("DATOS DEL CLIENTE: ");
        
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumCuenta());
        System.out.println(cuenta3.getSaldo());
    }
    
}
