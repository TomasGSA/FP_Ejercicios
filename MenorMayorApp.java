import java.util.Arrays;
import java.util.Scanner;

public class MenorMayorApp {
    /**
     * Programa que pida 6 números y los muestre en pantalla de menor a mayor
     *     1. Primero se muestre el menor de los 6.
     *     2. Después se muestre el mayor de los 6.
     *     3. Después se muestren los 6 números ordenados de menor a mayor.
     *     4. Después se muestren los 6 números ordenados de mayor a menor .
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numUno = sc.nextInt();
        System.out.println("Ingrese un numero");
        int numDos =sc.nextInt();
        System.out.println("Ingrese un numero");
        int numTres = sc.nextInt();
        System.out.println("Ingrese un numero");
        int numCua = sc.nextInt();
        System.out.println("Ingrese un numero");
        int numCin = sc.nextInt();
        System.out.println("Ingrese un numero");
        int numSei = sc.nextInt();
        // Una lista con los numeros
        int[] numeros = {numUno,numDos,numTres,numCua,numCin,numSei};
        int min=numeros[0];
        int max = numeros[0];
        int tmp = 0;
        System.out.println("Los numeros son: "+numUno+"-"+numDos+"-"+numTres+"-"+numCua+"-"+numCin+"-"+numSei);

        //Bucle for para saber el numero menor
        for(int i=0;i<numeros.length;i++){
            if(min>numeros[i]){
                min=numeros[i];
            }
        }
        System.out.println("El numero menor es: "+min);
        //Bucle for para saber el numero mayor
        for (int j=0;j<numeros.length;j++){
            if(max<numeros[j]){
                max=numeros[j];
            }
        }
        System.out.println("El numero mayor es: "+max);


        Arrays.sort(numeros);
        System.out.println("El orden de menor a mayor es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("El orden de mayor a menor es: ");
        for (int i = numeros.length -1 ; i >= 0; i--){
            System.out.println(numeros[i]);
        }

    }
}
