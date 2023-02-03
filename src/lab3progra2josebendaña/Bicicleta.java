package lab3progra2josebendaña;


public class Bicicleta extends Vehiculo{
    private String desc;
    private double radiorueda;
    private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String desc, double radiorueda, String color, String marca, String modelo, int anio, double precio, int cantllantas, String tipo) {
        super(color, marca, modelo, anio, precio, cantllantas);
        this.desc = desc;
        this.radiorueda = radiorueda;
        this.tipo=tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRadiorueda() {
        return radiorueda;
    }

    public void setRadiorueda(double radiorueda) {
        this.radiorueda = radiorueda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" Bicicleta{" + "desc=" + desc + ", radiorueda=" + radiorueda + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
