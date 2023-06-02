package Inmuebles;

public class Apartaestudio extends Apto {
    protected static double valorArea = 1500000;
    public Apartaestudio(int id, String direccion, int area, int numHabitaciones, int numBanos){
        super(id, direccion, area, numHabitaciones, numBanos);
    }
    void mostrar(){
        super.mostrar();
    }
}
