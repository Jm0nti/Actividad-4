package Inmuebles;

public class AptoFamiliar extends Apto {
    protected static double valorArea = 2000000;
    protected int administracion;
public AptoFamiliar(int id, String direccion, int area, int numHabitaciones, int numBanos, int administracion){
    super(id, direccion, area, numHabitaciones, numBanos);
    this.administracion = administracion;
}
void mostrar(){
    super.mostrar();
    System.out.println("Valor de la administracion: " + administracion);
    System.out.println();    
}
}