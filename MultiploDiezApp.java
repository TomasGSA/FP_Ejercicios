import java.util.Scanner;
public class MultiploDiezApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");

        int numero = sc.nextInt();

        if(numero % 10 == 0){
            System.out.println("El número "+numero+" es multiplo de 10");
        }else{
            System.out.println("No es multiplo de diez");
        }
    }
}
