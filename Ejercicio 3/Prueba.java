package Animales;

public class Prueba {
    public static void main(String[]args){
        Animal[] animales = new Animal[4];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Leon();
        animales[3] = new Lobo();

        for (int i=0; i<animales.length; i++){
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido"+ animales[i].getSonido());
            System.out.println("Alimentos"+ animales[i].getAlimentos());
            System.out.println("Habitat"+ animales[i].getHabitat());
            System.out.println();
        }
    }
}
