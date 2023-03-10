import java.util.Scanner;
public class NumeroPNApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un Número: ");
        int num = sc.nextInt();

        if( num >= 0 ){
            System.out.println(" Este número es positivo");
        }else{
            System.out.println(" Este número es negativo");
        }
        }
    }

