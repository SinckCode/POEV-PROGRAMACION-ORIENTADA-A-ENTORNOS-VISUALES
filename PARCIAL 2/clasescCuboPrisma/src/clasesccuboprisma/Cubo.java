/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesccuboprisma;

/**
 *
 * @author soyan
 */
public class Cubo {
    private double lado;
    private double volumen;
    private double area;

    public Cubo(double lado, double volumen, double area) {
        this.lado = lado;
        this.volumen = volumen;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cubo{");
        sb.append("lado=").append(lado);
        sb.append(", volumen=").append(volumen);
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
    
    
}
