package Ejer5;

public enum Producto {
    LAPIZ("Lapiz", "util para escribir o dibujar") {
        @Override
        public void ShowInfo() {

        }
    },
    CUADERNO("Cuaderno", "util para anotar o escribir cosas importantes") {
        @Override
        public void ShowInfo() {

        }
    },
    BORRADOR("Borrador", "util para borrar el lápiz") {
        @Override
        public void ShowInfo() {

        }
    },
    SACAPUNTA("Saca puntas", "util para sacarle punta a los colores o lápices") {
        @Override
        public void ShowInfo() {

        }
    },
    CARTUCHERA("Cartuchera", "util para guardar los productos, herramientas tipo escolares ") {
        @Override
        public void ShowInfo() {

        }
    };

    private String nombre;
    private String descripcion;

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public  String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public abstract void ShowInfo();
    public void mostrarDescripcionProducto() {
        System.out.println("EL nombre del producto es " + nombre + " y es " + descripcion);

    }
}
