package Punto3;

public class VideoJuego implements Comportamiento{
    private String titulo = "hola chiquess";
    private Float horas = (float)10;
    private Boolean entregado = false;
    private String genero = "Guarachaaa";
    private String compañia = "tu vieja";

    public VideoJuego() {
    }

    public VideoJuego(String titulo, Float horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public VideoJuego(String titulo, Float horas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getHoras() {
        return horas;
    }

    public void setHoras(Float horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
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
