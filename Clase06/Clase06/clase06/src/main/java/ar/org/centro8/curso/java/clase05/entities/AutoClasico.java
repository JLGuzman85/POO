package ar.org.centro8.curso.java.clase05.entities;

public class AutoClasico {
    
    private String marca;
    private String modelo;
    private String color;
    private String radio;
    
    public AutoClasico( String marca, String modelo,String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
     }

    public void ConRadio(String marca, String modelo, String color, String radio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.radio = radio;
        
}



    @Override
public String toString() {
    return "AutoClasico [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", radio=" + radio + "]";
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





}
