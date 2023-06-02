package Inmuebles;

public  class Casa extends InmuebleVivienda {
    protected int numPisos;
    public Casa(int id, String direccion, int area, int numHabitaciones, int numBanos, int numPisos){
        super(id, direccion, area, numHabitaciones, numBanos);
        this.numPisos = numPisos;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Numero de pisos: " + numPisos);
    }
}
