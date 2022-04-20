package ar.org.centro8.curso.java.clase05.entities;

public class Autonuevo {

    private String marca;
    private String modelo;
    private String color;
    private String radio;
    private int precio;

    
    public Autonuevo(String marca, String modelo, String color, String radio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = radio;
    }

    public void ConPrecio(String marca, String modelo, String color, String radio,int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = radio;
        this.precio = precio;

    }
     

    @Override
    public String toString() {
        return "Autonuevo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
