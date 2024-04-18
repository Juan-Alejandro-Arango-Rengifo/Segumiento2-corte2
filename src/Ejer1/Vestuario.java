package Ejer1;

public enum Vestuario {
    BLUSA("Blusa", "Prenda supeiror mujer", 1) {
        @Override
        public void ShowInfo() {

        }
    },
    JEAN("Jean", "Pantalon de tela denim", 2) {
        @Override
        public void ShowInfo() {

        }
    },
    CAMISETA("Camiseta", "Prenda de manga corta", 3) {
        @Override
        public void ShowInfo() {

        }
    },
    CAMISA("Camisa", "Prenda de vestir con botones", 4) {
        @Override
        public void ShowInfo() {

        }
    };

    private final String  nombre;
    private final String descripcion;
    private  final int numeroEstante;
    Vestuario(String nombre, String descripcion, int numeroEstante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroEstante = numeroEstante;
    }

    public String getNombre() {

        return nombre;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public int getNumeroEstante() {

        return numeroEstante;
    }

public  abstract void  ShowInfo();
     public  void mostrarDescripcionPrenda() {
         System.out.println("La " + nombre + " es una " + descripcion + " y se encuentra en el estante numero " + numeroEstante + ".");
     }
}



