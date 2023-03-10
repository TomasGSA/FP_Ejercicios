import java.util.Scanner;
public class BuclesCuartoEje {
    /**Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares
     * desde 1 hasta ese número separados por comas.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        int numeroUsu = sc.nextInt();

        System.out.print("Números impares desde 1 hasta " + numeroUsu + ": ");
        for (int i = 1; i <= numeroUsu; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

