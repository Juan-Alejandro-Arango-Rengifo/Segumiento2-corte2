package Ejer3;

import Ejer2.ServicioPeluqueria;

public enum VideoJuegos {

    BATTLEROYALE("FORTNITE", "Juego de battle royale en mapa abierto", 2017) {
        @Override
        public void ShowInfo() {

        }

        },
    HISTORIA("GOD OF WAR RAGNAROK", "Juego de aventura luchando y recolentando recompensas", 2022) {
        @Override
        public void ShowInfo() {

        }
    },
    ROLEPLAY("GRAND THEFT AUTO", "Videojuego de acción-aventura de mundo abierto", 2013) {
        @Override
        public void ShowInfo() {

        }
    },
    DEPORTE("FC 24", "Videojuego de futbol", 2023) {
        @Override
        public void ShowInfo() {

        }
    },
    ACCION("ELDEN RING", "Videojuego de rol, aventura y acción", 2023) {
        @Override
        public void ShowInfo() {

        }
    };



     private String nombre;
     private String descripcion;
    private int año;

    VideoJuegos(String nombre, String descripcion, int año) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.año = año;
    }




     public String getNombre(){
         return nombre;
     }

     public String getDescripcion() {
         return descripcion;
     }

     public double getAño() {
         return año;
     }

public abstract void ShowInfo();
     public void mostrarDescripcionServicio() {
         System.out.println("El Juego de " + nombre + " Consiste en " + descripcion);
         System.out.println("Es del año " + año );
     }





}
