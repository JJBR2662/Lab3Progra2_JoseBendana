package lab3progra2josebendaña;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Vehiculo> carros= new ArrayList();

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int id, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Vehiculo> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", carros=" + carros + '}';
    }
    
    
    
    
}
