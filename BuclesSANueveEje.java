

import java.util.Arrays;
import java.util.Scanner;


public class BuclesSANueveEje {
    /**Crea un array de números donde le indicamos por teclado el tamaño del array,  rellenaremos
     el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición
     y la suma de todos los valores. */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Indique el tamaño del arreglo: ");
      int tamano= sc.nextInt(); // Variabñe que toma el tamaño del array
      int[] ArrNumeros = new int[tamano];
      int suma= 0;
      System.out.println("El tamaño indicado es :"+tamano );
      System.out.println("Array antes de rellenar "+ Arrays.toString(ArrNumeros) );
      System.out.println("");
      System.out.println("Las posiciones y los valores del array son: ");
      //Bucle que genera numeros aleatorios entre 0 y 9, y los agrega al array, y imprime el orden del mismo
      for(int i=0; i<ArrNumeros.length;i++){
          int numR = (int) (Math.random() * 9 + 1);
          ArrNumeros[i] = numR;
          System.out.println("P. "+i+", valor ->"+numR);
      }
        System.out.println();
      // Bucle que suma los valores del array
      for(int i= 0;i< ArrNumeros.length;i++ ){
            suma += ArrNumeros[i];
      }
        System.out.println("La suma de los valores es: "+ suma);
    }
}
