package Punto1;

import java.util.Random;

public class Persona {
    public static final Character SEXO_DEFECTO = 'M' ;
    private String nombre = "";
    private Integer edad = 0;
    private String dni = "0000000";
    private Character sexo = SEXO_DEFECTO;
    private float altura = 0;
    private Float peso = 0.0f;


    public Persona() {
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = Character.toUpperCase(sexo);
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo,float altura, Float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = Character.toUpperCase(sexo);
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }


    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    ///(peso en
    //kg/(altura^2 en m)),
    public Integer calcularIMC (float altura, Float peso){

        Integer resp= 0;
        Float imc = peso/(altura*altura);

        if(imc < 20){
            resp = -1;
        } else if ( imc >= 20 && imc <= 25 ) {
            resp = 0;
        } else if (imc > 25) {
            resp = 1;
        }

        return resp;
    }



    public Boolean esMayordeEdad (){
        if(this.edad <18){
            return false;
        }else {
            return true;
        }
    }

    public void comprobarSexo(Character sexo){
        if(sexo != 'M' && sexo != 'H'){
            this.sexo = 'H';
        }
    }

    public static String generanNumeroRamdom8Cifras()
    {
        Random r = new Random();
       Long dni = r.nextLong(20000000,60000000);


      return dni.toString();
    }

    public void generaDNI ()
    {
        this.dni = generanNumeroRamdom8Cifras();
    }

}