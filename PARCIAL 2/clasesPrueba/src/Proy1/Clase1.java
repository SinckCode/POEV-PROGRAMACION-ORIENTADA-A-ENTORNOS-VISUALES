/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proy1;

/**
 *
 * @author soyan
 */
public class Clase1 {
    
    private int D1;
    int D2;
    protected int D3;
    public int D4;

    public Clase1(int D1, int D2, int D3, int D4) {
        this.D1 = D1;
        this.D2 = D2;
        this.D3 = D3;
        this.D4 = D4;
        setD1(1);
        setD2(2);
        setD3(3);
        setD4(4);

    }

    public int getD4() {
        return D4;
    }

    public void setD4(int D4) {
        this.D4 = D4;
    }

    public int getD2() {
        return D2;
    }

    public void setD2(int D2) {
        this.D2 = D2;
    }

    public int getD3() {
        return D3;
    }

    public void setD3(int D3) {
        this.D3 = D3;
    }

    public int getD1() {
        return D1;
    }

    public void setD1(int D1) {
        this.D1 = D1;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clase1{");
        sb.append("D1=").append(D1);
        sb.append(", D2=").append(D2);
        sb.append(", D3=").append(D3);
        sb.append(", D4=").append(D4);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
