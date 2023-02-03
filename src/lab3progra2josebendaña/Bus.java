package lab3progra2josebendaña;


public class Bus extends Vehiculo{
    private int cantpas;
    private String tipo;

    public Bus(){
    }

    public Bus(int cantpas, String color, String marca, String modelo, int anio, double precio, int cantllantas) {
        super(color, marca, modelo, anio, precio, cantllantas);
        this.cantpas = cantpas;
        if (cantpas>50) {
            tipo = "De Ruta";
        }else{
            tipo = "Rapidito";
        }
    }

    public int getCantpas() {
        return cantpas;
    }

    public void setCantpas(int cantpas) {
        this.cantpas = cantpas;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" Bus{" + "cantpas=" + cantpas + ", tipo=" + tipo + '}';
    }
    
    
}
