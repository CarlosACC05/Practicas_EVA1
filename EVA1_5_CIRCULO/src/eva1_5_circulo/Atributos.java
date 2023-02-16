package eva1_5_circulo;

/**
 *
 * @author carlo
 */
public class Atributos {

    private double radio;
    private double perimetro;
    private double area;

    public Atributos() {
        radio = 88;// no se utiliza porque ya se lo estoy asignando yo mismo
        perimetro = 0;
        area = 0;
    }

    public Atributos(double cRadio, double cPerimetro, double cArea) {
        radio = cRadio;
        perimetro = cPerimetro;
        area = cArea;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        radio = valor;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double valor) {
        area = valor;
        if (radio >= 0) {
            area = Math.PI * Math.pow(radio, 2);

        } else {
            System.out.println("El valor de radio debe ser superior de cero ya que no existen areas negativas");
        }
    }

    public void setPerimetro(double valor) {
        perimetro = valor;
        if (radio >= 0) {
            perimetro = Math.PI * (2 * radio);

        } else {
            System.out.println("El valor de radio debe ser superior de cero ya que no existen perimetros negativos");
        }

    }
}
