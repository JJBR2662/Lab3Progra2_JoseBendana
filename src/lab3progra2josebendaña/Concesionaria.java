package lab3progra2josebendaña;

import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Vehiculo> carros= new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private double saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int id, String direccion, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo=saldo;
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", carros=" + carros + ", clientes=" + clientes + ", saldo=" + saldo + '}';
    }
    
}
