package Inmuebles;

public class Inmueble{
    protected int id;
    protected String direccion;
    protected int area;
    protected double precioVenta;

    Inmueble(int id, String direccion, int area){
        this.id = id;
        this.direccion = direccion;
        this.area = area;
    }
    double calcPrecioVenta(double valorArea){
        precioVenta = area * valorArea;
        return precioVenta;
    }
    void mostrar(){
        System.out.println("Id: " + id);
        System.out.println("Direccion: " + direccion);
        System.out.println("Area: " + area);
        System.out.println("Precio de venta: $" + precioVenta);
    }
}