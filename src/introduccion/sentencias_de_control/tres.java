package introduccion.sentencias_de_control;

public class tres {
    public static void main(String[] args) {
        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe
        ejecutar una vez.
         */
        int numeroWhile = 2;
        do {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
    }
}
