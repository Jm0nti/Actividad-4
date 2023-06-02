package Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int numHabitaciones;
    protected int numBanos;
public InmuebleVivienda (int id, String direccion, int area, int numHabitaciones, int numBanos){
    super(id, direccion, area);
    this.numHabitaciones = numHabitaciones;
    this.numBanos = numBanos;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Numero de habitaciones: " + numHabitaciones);
        System.out.println("Numero de baños: " + numBanos);
    }
}
