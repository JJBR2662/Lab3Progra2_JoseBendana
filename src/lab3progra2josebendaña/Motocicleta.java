package lab3progra2josebendaña;


public class Motocicleta extends Vehiculo{
    private String despmotor;
    private boolean electrica;

    public Motocicleta(){
    }

    public Motocicleta(String despmotor, boolean electrica, String color, String marca, String modelo, int anio, double precio, int cantllantas) {
        super(color, marca, modelo, anio, precio, cantllantas);
        this.despmotor = despmotor;
        this.electrica = electrica;
    }

    public String getDespmotor() {
        return despmotor;
    }

    public void setDespmotor(String despmotor) {
        this.despmotor = despmotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString()+" Motocicleta{" + "despmotor=" + despmotor + ", electrica=" + electrica + '}';
    }
    
    
}
