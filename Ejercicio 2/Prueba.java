package Inmuebles;

public class Prueba {
    public static void main (String args[]){
        AptoFamiliar apto1 =new AptoFamiliar(1, "Calle 1", 100, 3, 2, 1);
        System.out.println("Datos del apto 1");
        apto1.calcPrecioVenta(AptoFamiliar.valorArea);
        apto1.mostrar();

        System.out.println("Datos del apto 2");
        Apartaestudio apte1=new Apartaestudio(2, "Calle 2", 50, 1, 1);
        apte1.calcPrecioVenta(Apartaestudio.valorArea);
        apte1.mostrar();
    }
}
