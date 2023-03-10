import java.util.Scanner;
public class EsVocalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Programa que pida una letra y detecte si es una vocal.
        char letra;
        System.out.println("ingrese una letra: ");
        letra = sc.next().charAt(0);


        if((letra == 'a'||letra == 'A')||(letra == 'e'||letra == 'E')||(letra == 'i'||letra == 'I')||(letra == 'o'||letra == 'O')||(letra == 'u'||letra == 'U')){
            System.out.println("Caracter introducido "+letra+" es vocal");
        } else{
            System.out.println("Caractert introducido "+letra+" No es vocal");
        }
    }
}
