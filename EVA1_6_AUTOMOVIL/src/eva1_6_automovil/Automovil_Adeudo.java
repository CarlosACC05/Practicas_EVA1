/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author carlo
 */
public class Automovil_Adeudo {

    private String marca = "";
    private String modelo = "";
    private String placas = "";
    private int año;
    private String dueño;

    public Automovil_Adeudo() {
        marca = "---";
        modelo = "---";
        placas = "---";
        año = 0;
        dueño = "---";

    }

    public Automovil_Adeudo(String marcaAuto, String modeloAuto, String placasAuto, int añoAuto, String dueñoAuto) {
        marca = marcaAuto;
        modelo = modeloAuto;
        placas = placasAuto;
        año = añoAuto;
        dueño = dueñoAuto;

    }

    public String getMarca() {
        return marca;

    }

    public String getModelo() {
        return modelo;

    }

    public String getPlacas() {
        return placas;

    }

    public int getAño() {
        return año;

    }

    public String getDueño() {
        return dueño;

    }

    public void setMarca(String valorMarca) {
        marca = valorMarca;
    }

    public void setModelo(String valorModelo) {
        modelo = valorModelo;
    }

    public void setPlacas(String valorPlacas) {
        placas = valorPlacas;
    }

    public void setAño(int valorAño) {
        año = valorAño;
    }

    public void setDueño(String valorDueño) {
        dueño = valorDueño;
    }

    public int calcularAdeudo() {
        int adeudo=0;
        if (año <= 2000){
        adeudo=1500;    
        }else if((año>=2001) && (año<=2005)){
        adeudo=2000;
        }else if((año>=2006) && (año<=2010)){
        adeudo=2500;
        }else if((año>=2011) && (año<=2015)){
        adeudo=3000;
        }else if((año>=2016) && (año<=2023)){
        adeudo=3500;
        }
        return adeudo;
    }
    
    public void imprimirDatos(){
        System.out.println("AUTOMOVIL");
        System.out.println("La marca es: " +marca);
        System.out.println("El modelo es: " +modelo);
        System.out.println("La placa es: "+placas );
        System.out.println("El año es: "+ año);
        System.out.println("El dueño es: "+ dueño);
        System.out.println("El adeudo es: "+calcularAdeudo());
    
    }

}
