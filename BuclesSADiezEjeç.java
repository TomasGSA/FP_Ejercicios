import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BuclesSADiezEjeç {
    /**Crea un array de números de un tamaño pasado por teclado, el array contendrá números
     aleatorios entre los números deseados, por último nos indica cual es el mayor de todos y la suma
     de todos ellos. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el tamaño del array: ");
        Random rand = new Random();
        int tamano = sc.nextInt();

        int[] arNumeros = new int[tamano];

        int suma = 0;

        int max= arNumeros[0];

        for(int i=0; i < arNumeros.length; i++){
            arNumeros[i] = rand.nextInt(tamano);
        }
        System.out.println(Arrays.toString(arNumeros));

        for(int i=0; i< arNumeros.length; i++){
            suma += arNumeros[i];
        }
        System.out.println("La suma de todos los valores es -> "+suma);

        for(int i=0;i< arNumeros.length; i++){
            if(max<arNumeros[i]){
                max=arNumeros[i];
            }
        }
        System.out.println("El numero mayor es -> "+max);
    }
}
