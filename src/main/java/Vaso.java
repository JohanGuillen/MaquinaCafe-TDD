public class Vaso {

    private int cantidadVasos;
    private int capacidadVaso;

    public Vaso(int cantidadVasos, int capacidadVaso) {
        this.cantidadVasos = cantidadVasos;
        this.capacidadVaso = capacidadVaso;
    }

    public boolean hasVasos(int cantidad) {
        return cantidadVasos >= cantidad;
    }

    public void giveVasos(int cantidad) {
        cantidadVasos -= cantidad;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public int getCapacidadVaso() {
        return capacidadVaso;
    }
}
