import java.util.Scanner;
public class BuclesSeisEje {
    /** Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;


        do{
            System.out.println("Introduce palabra");
            palabra = sc.nextLine();
            System.out.println(palabra);
        }while(!palabra.equalsIgnoreCase("Salir"));

    }
}
