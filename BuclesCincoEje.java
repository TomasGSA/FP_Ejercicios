
import java.util.Scanner;
public class BuclesCincoEje {
    /**Escribir un programa que pida al usuario una palabra y luego muestre por pantalla
     * una a una las letras de la palabra introducida empezando por la última. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();


        System.out.println("La palabra introduccida es: "+palabra);
        System.out.print("La palabra al reves es: ");
        for(int i = palabra.length() - 1;i >= 0;i--){
            System.out.print(palabra.charAt(i));
        }
    }
}
