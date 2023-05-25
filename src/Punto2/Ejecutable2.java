package Punto2;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static Punto2.Password.cadenaAleatoria;

public class Ejecutable2 {
    public static void main(String[] args) {
        ArrayList <Password> contraseñas = new ArrayList <>();
        Boolean contraseñasFuertes[];
        contraseñasFuertes = new Boolean [10];

        System.out.println("Hasta aca anda");



        int longi = 14;
        for (int i=0; i<10;i++){
            Password j = new Password(cadenaAleatoria(longi));
            contraseñas.add(j);
            if(j.esFuerte()){
                contraseñasFuertes[i]=true;
            }else {
                contraseñasFuertes[i]=false;
            }

        }

         for(Password e : contraseñas){
             System.out.println(e.toString());
         }

         for(int i=0; i<contraseñasFuertes.length; i++){
             System.out.println(contraseñasFuertes[i].toString());
             System.out.println(contraseñas.get(i).toString());
        }


    }

}
