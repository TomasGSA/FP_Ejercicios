import java.util.Arrays;

public class BuclesSAOnceEje {
    /**Crea un array de números de 65 posiciones, que contendrá los números del 1 al 65. Obtén
     la suma de todos ellos y la media */
    public static void main(String[] args) {
        int[] arNumeros = new int[65];
        int suma = 0;

        for(int i=0; i<arNumeros.length;i++){
            arNumeros[i]= i+1;
        }
        System.out.println(Arrays.toString(arNumeros));

        for(int i=0; i<arNumeros.length;i++){
            suma += arNumeros[i];
        }
        System.out.println("la suma de todos los valores del array es -> "+suma);
        System.out.println("");
        System.out.println("La media es ->"+ (suma/65));
    }
}
