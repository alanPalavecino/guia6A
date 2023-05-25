package Punto3;

import java.util.HashMap;
import java.util.Map;

public class Serie implements Comportamiento {
    private String titulo ="hola";
    private Integer cantTemporadas=3;
    private Boolean entregado=false;
    private String creador="mundo";
    private Genero genero = Genero.TERROR;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, Integer cantTemporadas, String creador, Genero genero) {
        this.titulo = titulo;
        this.cantTemporadas = cantTemporadas;
        this.creador = creador;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(Integer cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Serie{\n" +
                "titulo:..............." + titulo + '\n' +
                "cantTemporadas:......." + cantTemporadas + '\n' +
                "entregado:............" + entregado +  '\n' +
                "creador:.............." + creador + '\n' +
                "genero:..............." + genero +  '\n' +
                '}';
    }




    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }
}
