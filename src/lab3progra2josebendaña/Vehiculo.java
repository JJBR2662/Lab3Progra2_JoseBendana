package lab3progra2josebendaña;


public class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;
    protected int cantllantas;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, int anio, double precio, int cantllantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.cantllantas = cantllantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantllantas() {
        return cantllantas;
    }

    public void setCantllantas(int cantllantas) {
        this.cantllantas = cantllantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + ", cantllantas=" + cantllantas + '}';
    }
    
    
}
