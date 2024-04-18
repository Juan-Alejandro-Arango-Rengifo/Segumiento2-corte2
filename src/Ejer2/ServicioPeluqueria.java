package Ejer2;

public enum ServicioPeluqueria {
    CORTE("Corte de cabello", "Servicio para recortar o dar forma al cabello", 15000) {
        @Override
        public void realizarServicio() {

        }
    },
    UÑAS("Manicura y pedicura","Cuidado y embellecimiento de uñas",45000) {
        @Override
        public void realizarServicio() {

        }
    },
    TINTE("Tinte de cabello", "CAmbio de color de cabello", 50000) {
        @Override
        public void realizarServicio() {

        }
    };

    private String nombre;
    private String descripcion;
    private double precio;

    ServicioPeluqueria(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void realizarServicio();
     public void mostrarDescripcionServicio() {
         System.out.println("El servicio de " + nombre + " Consiste en " + descripcion);
         System.out.println("Precio $ " + precio );
     }


}
