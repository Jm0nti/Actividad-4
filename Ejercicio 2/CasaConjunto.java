package Inmuebles;

public class CasaConjunto extends CasaUrbana{
    protected static double valorArea = 2500000;
    protected int administracion;
    protected boolean piscina;
    protected boolean deportivos;
    public CasaConjunto(int id, String direccion, int area, int numHabitaciones, int numBanos, int numPisos, int administracion, boolean piscina, boolean deportivos){
        super(id, direccion, area, numHabitaciones, numBanos, numPisos);
        this.administracion = administracion;
        this.piscina = piscina;
        this.deportivos = deportivos;
    }
void mostrar(){
    super.mostrar();
    System.out.println("Valor de la administracion: " + administracion);
    System.out.println("Piscina: " + piscina);
    System.out.println("Zonas deportivas: " + deportivos);
    System.out.println();    
}
}
