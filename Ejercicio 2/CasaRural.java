package Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int dCabecera;
protected int altitud;
    public CasaRural(int id, String direccion, int area, int numHabitaciones, int numBanos, int numPisos, int dCabecera, int altitud){
        super(id, direccion, area, numHabitaciones, numBanos, numPisos);
        this.dCabecera = dCabecera;
        this.altitud = altitud;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Distancia a cabecera municipal: " + dCabecera);
        System.out.println("Altitud: " + altitud);
        System.out.println();
    }    
}
