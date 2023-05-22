package Punto2;

import java.util.Random;

public class Password implements Comparable <Password> {
    private Integer longitud = 8;
    private String contraseña = "";


    public static String cadenaAleatoria(int longitud) {

        String banco = "abcdefghijklMNOPQRSTUVWXYZ1234567890";
        String cadena = "";
        Random r = new Random();

        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = r.nextInt(0,banco.length());
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    public Password(Integer longitud) {
        this.longitud = longitud;
        this.contraseña =  cadenaAleatoria(longitud);
    }

    public Password(Integer longitud, String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }



    public Password(String contraseña) {
        this.contraseña = contraseña;
        this.longitud = contraseña.length();
    }

    public Password() {
    }

    public Integer getLogitud() {
        return longitud;
    }

    public void setLogitud(Integer logitud) {
        this.longitud = logitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Password{" +
                "logitud=" + longitud +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public Boolean esFuerte(){

        int may=0;
        int min=0;
        int num=0;

        for (Character c : contraseña.toCharArray()){
            if (Character.isUpperCase(c)) {
                may++;
            }if(Character.isLowerCase(c)){
                min++;
            }else if (Character.isDigit(c)){
                num++;
            }
        }
        ///System.out.println("may = "+ may + " min = " + min + " num= " + num);
        if(may>=2 && min >= 1 && num >= 5){
            return true;
        }
        return false;
    }




    @Override
    public int compareTo(Password o) {
        int resultado =0;
        if(this.contraseña.equals(o.getContraseña())){
            resultado = 1;
        }else {
            resultado =0;
        }
        return resultado;
    }
}
