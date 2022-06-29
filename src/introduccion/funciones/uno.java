package introduccion.funciones;

public class uno {
    public static void main(String[] args) {
        /*
        Crear una función con 3 parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
         */
        int suma = sumar(1, 2, 3);
        System.out.println("Resultado: " + suma);
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}
