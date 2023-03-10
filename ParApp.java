import java.util.Scanner;
public class ParApp {
    public static void main(String[] args) {

                Scanner sc = new Scanner (System.in);
                System.out.println("ingrese un numero: ");
                int num = sc.nextInt();

                if(num % 2 == 0 ){
                    System.out.println("el número "+num+" es par");
                }else{
                    System.out.println("El número"+num+" es impar");
                }
    }
}
