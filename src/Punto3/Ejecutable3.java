package Punto3;

import java.util.HashMap;
import java.util.Map;

public class Ejecutable3 {
    public static void main(String[] args) {
      HashMap <String, Serie> series = new HashMap<String, Serie>();
      HashMap <String, VideoJuego> juegos = new HashMap<String, VideoJuego>();

      Serie s1 = new Serie();
      Serie s2 = new Serie("the wlaking dead", "Robert Kirkman");
      Serie s3 = new Serie("13 reason why", 4, "tuvien4", Genero.FICCION);
      Serie s4 = new Serie("La casa de papel", "el viejo");
      Serie s5 = new Serie("the last of us", 3, "rick grimes", Genero.FICCION);

      VideoJuego j1 = new VideoJuego();
      VideoJuego j2 = new VideoJuego("FIFA 2023", (float)5, "futbol", "EASport");
      VideoJuego j3 = new VideoJuego("fornite", (float)4);
      VideoJuego j4 = new VideoJuego("Kratos", (float)5, "accion", "niidea");
      VideoJuego j5 = new VideoJuego("no se que otr juego", (float)10);


      series.put(s1.getTitulo(), s1 );
      series.put(s2.getTitulo(), s2 );
      series.put(s3.getTitulo(), s3 );
      series.put(s4.getTitulo(), s4 );
      series.put(s5.getTitulo(), s5 );

      juegos.put(j1.getTitulo(), j1);
      juegos.put(j2.getTitulo(), j2);
      juegos.put(j3.getTitulo(), j3);
      juegos.put(j4.getTitulo(), j4);
      juegos.put(j5.getTitulo(), j5);

      System.out.println(muestraSerieXTitulo(series, "13 reason why"));
      modificarEntregadoEnMapSerie(series, "13 reason why");
      System.out.println(muestraSerieXTitulo(series, "13 reason why"));

      Integer juegosent=0;
      Integer seriesent=0;

      juegosent = cuentaJuegosEntregados(juegos);
      seriesent = cuentaSeriesEntregadas(series);

      System.out.println("series entregadas= " + seriesent + " y juegso entregados= "+ juegosent);

      VideoJuego j = juegoMasLargo(juegos);
      Serie s = serieMasLarga(series);
      System.out.println("El juego mas largo es: " + j.toString() + " y la serie es  "+ s.toString());



    }

  public static Serie muestraSerieXTitulo (HashMap <String, Serie> series,String titulo){
    Serie resp =null;
      for(HashMap.Entry<String, Serie> s : series.entrySet()){


      if(s.getKey().equals(titulo)){
        resp = s.getValue();
      }

    }
    return resp;
  }

  public static void modificarEntregadoEnMapSerie(HashMap <String, Serie> series,String titulo){
    for(HashMap.Entry<String, Serie> s : series.entrySet()){


      if(s.getKey().equals(titulo)){
        Serie c = s.getValue();
        c.entregar();
        s.setValue(c);
      }

    }
  }

  public static VideoJuego muestraJuegoXTitulo (HashMap <String, VideoJuego> juegos,String titulo){
    VideoJuego resp =null;
    for(HashMap.Entry<String, VideoJuego> s : juegos.entrySet()){


      if(s.getKey().equals(titulo)){
        resp = s.getValue();
      }

    }
    return resp;
  }

  public static void modificarEntregadoEnMapJuego(HashMap <String, VideoJuego> juegos,String titulo){
    for(HashMap.Entry<String, VideoJuego> s : juegos.entrySet()){


      if(s.getKey().equals(titulo)){
        VideoJuego c = s.getValue();
        c.entregar();
        s.setValue(c);
      }

    }
  }

  public static Integer cuentaJuegosEntregados (HashMap <String, VideoJuego> juegos){
    Integer cont=0;
    for (Map.Entry <String, VideoJuego> j : juegos.entrySet()){
      if(j.getValue().isEntregado()){
        cont++;
      }
    }
    return cont;
  }
  public static Integer cuentaSeriesEntregadas (HashMap <String, Serie> series){
    Integer cont=0;
    for (Map.Entry <String, Serie> j : series.entrySet()){
      if(j.getValue().isEntregado()){
        cont++;
      }
    }
    return cont;
  }

  public static VideoJuego juegoMasLargo (HashMap <String, VideoJuego> juegos){
    int i=0;
    VideoJuego largo=null;
    for (Map.Entry<String, VideoJuego> j : juegos.entrySet()){
     if(i==0){
      largo=j.getValue();
     }
      if(j.getValue().getHoras() > largo.getHoras()){
        largo = j.getValue();
      }
       i++;
    }
    return largo;
  }

  public static Serie serieMasLarga (HashMap <String, Serie> series){
    int i=0;
    Serie larga=null;
    for (Map.Entry<String, Serie> j : series.entrySet()){
      if(i==0){
        larga=j.getValue();
      }
      if(j.getValue().getCantTemporadas() > larga.getCantTemporadas()){
        larga = j.getValue();
      }
      i++;
    }
    return larga;
  }

}
