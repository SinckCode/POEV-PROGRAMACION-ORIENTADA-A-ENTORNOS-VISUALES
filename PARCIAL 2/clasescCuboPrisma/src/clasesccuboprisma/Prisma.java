/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesccuboprisma;

/**
 *
 * @author soyan
 */
public class Prisma extends Cubo{
    protected double base;
    protected double altura;
    protected double ancho;

    public Prisma(double base, double altura, double ancho, double lado, double volumen, double area) {
        super(lado, volumen, area);
        this.base = base;
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prisma{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append(", ancho=").append(ancho);
        sb.append('}');
        return sb.toString();
    }
    
    
}
