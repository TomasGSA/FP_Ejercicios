import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class BucleDOCE {
    /**Crea un programa que divida el texto (oracion) en un array de las frases que forman la frase*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");

        String frase = sc.nextLine();

        String[] oracion = frase.split("\\.|\\,");

        System.out.println(Arrays.toString(oracion));
    }
}
