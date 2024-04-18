package Ejer5;



public class Main {
    public static void main(String[] args) {
        for (Producto servicio : Producto.values()) {
            servicio.mostrarDescripcionProducto();
            servicio.ShowInfo();
        }
    }
}
