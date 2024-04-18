package Ejer3;

public class Main {
    public static void main(String[] args) {
        for (VideoJuegos servicio : VideoJuegos.values()) {
            servicio.mostrarDescripcionServicio();
            servicio.ShowInfo();
        }
    }
}
