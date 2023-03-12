import java.util.Scanner;
public class BuclesSAUnoEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        int suma = 0;
        System.out.println("El numero introducido es: "+num);
        for(int i = num + 1 ; i<= num + 10  ;i++){
            suma += i;
        }
        System.out.println("La suma de los siguientes 10 números a " + num + " es " + suma);
    }
}
