package introduccion.funciones;

public class Coche {
    private int puertas;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void addPuerta(){
        this.puertas += 1;
    }
}
