package lab3progra2josebendaña;


public class Camion extends Vehiculo{
    private int volumenmax;
    private int altura;
    private boolean tieneexc;

    public Camion(){
    }

    public Camion(int volumenmax, int altura, boolean tieneexc, String color, String marca, String modelo, int anio, double precio, int cantllantas) {
        super(color, marca, modelo, anio, precio, cantllantas);
        this.volumenmax = volumenmax;
        this.altura = altura;
        this.tieneexc = tieneexc;
    }

    public int getVolumenmax() {
        return volumenmax;
    }

    public void setVolumenmax(int volumenmax) {
        this.volumenmax = volumenmax;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isTieneexc() {
        return tieneexc;
    }

    public void setTieneexc(boolean tieneexc) {
        this.tieneexc = tieneexc;
    }

    @Override
    public String toString() {
        return super.toString()+" Camion{" + "volumenmax=" + volumenmax + ", altura=" + altura + ", tieneexc=" + tieneexc + '}';
    }
    
    
    
    
}
