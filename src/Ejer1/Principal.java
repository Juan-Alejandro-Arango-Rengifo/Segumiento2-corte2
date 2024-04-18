package Ejer1;



public class Principal {
    public static void main(String[] args) {
        for (Vestuario servicio : Vestuario.values()) {
            servicio.mostrarDescripcionPrenda();
            servicio.ShowInfo();
        }
    }
}
