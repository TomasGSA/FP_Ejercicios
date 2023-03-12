import java.util.Scanner;
public class BuclesSATresEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int altura = sc.nextInt();

        for(int i = 1 ; i <= altura ; i++){
           for(int x = 1 ;x <= i ; x++) {
               System.out.print(x + "");
           }
            System.out.println();
        }
    }
}
