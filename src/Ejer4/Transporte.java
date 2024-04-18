package Ejer4;

public enum Transporte {

    BUS("Bus", 30, "Gasolina") {
        @Override
        public void ShowInfo() {

        }
    },
    METRO("Metro",200,"ELectrico") {
        @Override
        public void ShowInfo() {

        }
    },
    BARCO("Barco",1500, "Gasolina") {
        @Override
        public void ShowInfo() {

        }
    },
    MOTO("Moto",2, "Gasolina") {
        @Override
        public void ShowInfo() {

        }
    },
    AVION("Avion",180, "Gasolina" ){
        @Override
        public void ShowInfo() {

        }
    };

    private String nombre;
    private int capacidad;
    private String motor;

    Transporte(String nombre, int capacidad, String motor) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.motor = motor;
    }

    public String getNombre() {
        return nombre;
    };

    public int getCapacidad() {
        return capacidad;
    }
    public String getMotor(){
        return motor;
    }

    public abstract void ShowInfo();
    public void mostrarDescripcionTransporte() {
        System.out.println("El vehivulo " + nombre + " tiene una capacidad de " + capacidad + " pasajeros, y tiene un motor a " + motor);

    }
}
