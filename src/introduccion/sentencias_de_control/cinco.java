package introduccion.sentencias_de_control;

public class cinco {
    public static void main(String[] args) {
        /*
        Por último, para el Switch, deberás crear la variable estación, y distintos case para las cuatro
        estaciones del año.
        Dependiendo del valor de la variable estación se deberá mandar un mensaje por
        consola informando de la estación en la que está.
        También habrá que poner un default para cuando
        el valor de la variable no sea una estación.
         */
        String estacion = "INVIERNO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estación del año actual es primavera");
                break;
            case "VERANO":
                System.out.println("La estación del año actual es verano");
                break;
            case "OTOÑO":
                System.out.println("La estación del año actual es otoño");
                break;
            case "INVIERNO":
                System.out.println("La estación del año actual es invierno");
                break;
            default:
                System.out.println("\"" + estacion + "\" no es una estación del año");
        }
    }
}
