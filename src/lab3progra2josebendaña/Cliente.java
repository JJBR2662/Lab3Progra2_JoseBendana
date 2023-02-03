package lab3progra2josebendaña;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private ArrayList<Vehiculo> carrosobtenidos = new ArrayList();
    private double saldo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getCarrosobtenidos() {
        return carrosobtenidos;
    }

    public void setCarrosobtenidos(ArrayList<Vehiculo> carrosobtenidos) {
        this.carrosobtenidos = carrosobtenidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", carrosobtenidos=" + carrosobtenidos + ", saldo=" + saldo + '}';
    }
    
    
}
