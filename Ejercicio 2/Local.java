package Inmuebles;

public class Local extends Inmueble {
    enum tipo{INTERNO, EXTERNO};
    protected tipo tipoLocal;
    public Local(int id, String direccion, int area, tipo tipoLocal){
        super(id, direccion, area);
        this.tipoLocal = tipoLocal;
    }
    void mostrar(){
        super.mostrar();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
