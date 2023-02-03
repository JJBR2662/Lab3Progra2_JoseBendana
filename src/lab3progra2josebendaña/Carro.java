
package lab3progra2josebendaña;


public class Carro extends Vehiculo{
    private int cantpuertas;
    private String descmotor;
    private int velocidad;

    public Carro(){
    }

    public Carro(int cantpuertas, String descmotor, int velocidad, String color, String marca, String modelo, int anio, double precio, int cantllantas) {
        super(color, marca, modelo, anio, precio, cantllantas);
        this.cantpuertas = cantpuertas;
        this.descmotor = descmotor;
        this.velocidad = velocidad;
    }

    public int getCantpuertas() {
        return cantpuertas;
    }

    public void setCantpuertas(int cantpuertas) {
        this.cantpuertas = cantpuertas;
    }

    public String getDescmotor() {
        return descmotor;
    }

    public void setDescmotor(String descmotor) {
        this.descmotor = descmotor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+" Carro{" + "cantpuertas=" + cantpuertas + ", descmotor=" + descmotor + ", velocidad=" + velocidad + '}';
    }
    
    
    
    
}
