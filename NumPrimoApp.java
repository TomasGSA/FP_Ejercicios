import java.util.Scanner;
public class NumPrimoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1-30 ");
        int num = sc.nextInt();


        if (num <= 30) {
            if (esPrimo(num)) {
                System.out.println("El número " + num + " es primo");
            } else {
                System.out.println("El número " + num + " no es primo");
            }
        } else {
            System.out.println("Numero no soportado");
        }

    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        //bucle que cuenta los numeros divisibles
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador < 1;
    }
}