package Inmuebles;

public class LocalComercial extends Local {
    protected static double valorArea=3000000;
    protected String centroComercial;
    public LocalComercial(int id, String direccion, int area, tipo tipoLocal, String centroComercial){
        super(id, direccion, area, tipoLocal);
        this.centroComercial = centroComercial;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Centro comercial: " + centroComercial);
        System.out.println();
    }

}
