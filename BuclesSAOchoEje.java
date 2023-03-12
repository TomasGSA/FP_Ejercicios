import java.util.Scanner;
public class BuclesSAOchoEje {
    /**Crea un array de 7 posiciones de números con valores pedidos por teclado. Muestra por
     consola el índice y el valor al que corresponde.*/
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i <numeros.length ;i++){
            System.out.println("Introduzca número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("indice y valor ingresado");
        for(int x=0; x< numeros.length;x++){
            System.out.println("indice "+x+" Valor "+numeros[x]);
        }
    }
}
