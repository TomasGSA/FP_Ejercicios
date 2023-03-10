import java.util.Scanner;
public class LetraMayApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una letra: ");
        char letra = sc.next().charAt(0);

        if( Character.isUpperCase(letra)){
            System.out.println("La letra "+letra+" es mayuscúla");
        }else{
            System.out.println("La letra "+letra+" es minuscúla");
        }

    }
}
