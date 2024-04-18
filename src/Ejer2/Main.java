package Ejer2;

public class Main {
    public static void main(String[] args) {
        for (ServicioPeluqueria servicio : ServicioPeluqueria.values()) {
            servicio.mostrarDescripcionServicio();
            servicio.realizarServicio();
        }
    }
}
