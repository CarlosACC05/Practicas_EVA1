/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_.constructores;

/**
 *
 * @author carlo
 */
public class CuentaBancaria {
    //Atributos de la clase tienen que ser privados
    private String numCuenta;
    private double saldo;
    private String nomcliente;
    //constructores
    //default y con argumentos
    public CuentaBancaria(){//contructor default
        numCuenta = "----";
        saldo = 0;
        nomcliente = "----";
    
    }
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
        numCuenta= nCuenta;
        saldo= otroSaldo;
        nomcliente= nCliente;
    }
    
    
    //comportamiento
    //metodos get y set
    public String getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(String n){
        numCuenta = n;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        saldo = s;
    }
    public String getNomCliente(){
        return nomcliente;
    }
    public void setNomCliente(String c){
        nomcliente = c;
    }
    public void imprimirDatos(){
        System.out.println("El nombre del cliente es: " + nomcliente);
        System.out.println("El numero de cuenta: " + numCuenta);
        System.out.println("Su saldo es: " + saldo);
        
    }
    
}
