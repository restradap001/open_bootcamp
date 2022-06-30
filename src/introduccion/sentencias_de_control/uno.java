package introduccion.sentencias_de_control;

public class uno {
    public static void main(String[] args) {
        /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo o 0
         */
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es igual a 0");
        }
    }
}
