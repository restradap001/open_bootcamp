package introduccion.funciones;


public class dos {
    public static void main(String[] args) {
        /*
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.
         */
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("Número de puertas: " + miCoche.getPuertas());
    }
}
