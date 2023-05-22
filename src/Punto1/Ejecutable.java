package Punto1;

//import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nom = in.nextLine();

        System.out.println("Ingrese edad:");
        Integer anios = in.nextInt();
        in.nextLine();

        System.out.println("Ingrese sexo:");
        char sex = in.nextLine().charAt(0);



        System.out.println("Ingrese altura:");
        float alt = in.nextFloat();
        in.nextLine();

        System.out.println("Ingrese peso:");
        float peso = in.nextFloat();

        Persona p1 = new Persona(nom, anios, Persona.generanNumeroRamdom8Cifras() , sex,alt, peso );
        Persona p2 = new Persona(nom, anios, sex);
        Persona p3 = new Persona("jorge", 23, Persona.generanNumeroRamdom8Cifras(), 'M', (float)1.56, (float)57.9);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

       mensajePesoIdeal(p1.calcularIMC(p1.getAltura(), p1.getPeso()));
       mensajePesoIdeal(p2.calcularIMC(p2.getAltura(), p2.getPeso()));
       mensajePesoIdeal(p3.calcularIMC(p3.getAltura(), p3.getPeso()));

        HashMap <String, Persona> personas = new HashMap<>();

        personas.put(p1.getDni(), p1);
        personas.put(p2.getDni(), p2);
        personas.put(p3.getDni(), p3);

        System.out.println(personas);




    }

    public static void mensajePesoIdeal (int resp){
        if(resp == -1){
            System.out.println("Usted esta debajo de su peso ideal");
        }else if(resp == 0){
            System.out.println("Usted esta en su peso ideal ");
        }else{
            System.out.println("Usted tiene sobrePeso");
        }
    }
}
