package Ejer4;



public class Main {
    public static void main(String[] args) {
        for (Transporte servicio : Transporte.values()) {
            servicio.mostrarDescripcionTransporte();
            servicio.ShowInfo();
        }
    }
}
