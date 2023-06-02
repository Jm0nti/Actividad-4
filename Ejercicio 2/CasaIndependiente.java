package Inmuebles;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;
    public CasaIndependiente(int id, String direccion, int area, int numHabitaciones, int numBanos, int numPisos){
        super(id, direccion, area, numHabitaciones, numBanos, numPisos);
    }
    void mostrar(){
        super.mostrar();
        System.out.println();
    }
    
}
