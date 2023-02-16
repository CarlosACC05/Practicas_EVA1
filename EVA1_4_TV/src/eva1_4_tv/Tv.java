/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author carlo
 */
public class Tv {

    private int volumen;
    private int canal;
    private boolean poder;

    //contructores
    public Tv() {//constructor default
        volumen = 98;
        canal = 100;
        poder = false;//apagado

    }

    //metodos para operar la Tv(interfaz)
    //encender y apagar TV
    public void cambiarEstadoPoder() {
        if (poder == true) {
            poder = false;
            System.out.println("Apagando pantalla");
        } else {
            poder = true;
            System.out.println("Encendiendo pantalla");
        }

    }
    //volumen

    public void subirVolumen() {
        if (poder == true) {
            if (volumen < 100) {
                volumen = volumen + 1;//acumulador//volumen++;//volumen+=1;
            }

            System.out.println("Volumen: " + volumen);
        }//if(poder)la tv esta prendida
        //no debemos de pasar de 100

    }

    public void bajarVolumen() {
        if (poder == true) {
            if (volumen > 0) {
                volumen = volumen - 1;//acumulador//volumen--;//volumen-=1;
            }
            System.out.println("Volumen: " + volumen);
        }//if(poder)la tv esta prendida

    }

    public void subirCanal() {
        if (poder == true) {
            canal++;
            if (canal > 100) {
                canal = 0;
            }
            System.out.println("Canal: " + canal);
        }

    }

    public void bajarCanal() {
        if (poder == true) {
            canal--;
            if (canal < 0) {
                canal = 100;
            }
            System.out.println("Canal: " + canal);
        }

    }
}
