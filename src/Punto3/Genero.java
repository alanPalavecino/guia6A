package Punto3;

public enum Genero {


    TERROR("terror"),COMEDIA("comedia"), ACCION("accion"), FICCION("FICCION");


    private String nombre;

    private Genero(String nombre){
        this.nombre = nombre;
    }

    private String getnombre(){
        return this.nombre;
    }

}
