package Inmuebles;

public class Oficina extends Local {
    protected static double valorArea=3500000;
    protected boolean esGobernacion;
    public Oficina(int id, String direccion, int area, tipo tipoLocal, boolean esGobernacion){
        super(id, direccion, area, tipoLocal);
        this.esGobernacion = esGobernacion;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Es gobernacion: " + esGobernacion);
        System.out.println();
    }
}
