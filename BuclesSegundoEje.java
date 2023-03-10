import java.util.Scanner;
public class BuclesSegundoEje {
    public static void main(String[] args) {
        //Escribir un  programa  que  pida  al usuario  una  palabra  y  la  muestre  por  pantalla 10 veces.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra ");
        String palabra = sc.nextLine();

        for(int i = 0; i <=10;i++){
            System.out.println(i+". "+palabra);
        }
    }
}
