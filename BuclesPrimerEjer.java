
import java.util.Scanner;
public class BuclesPrimerEjer {
    public static void main(String[] args) {
        //Crea un programa que pida un número por pantalla e imprima su tabla de multiplicar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del que desea saber la tabla de multiplicar: ");
        int usu = sc.nextInt();
        int Mnumero[]= {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Tabla de multiplicar del numero "+usu);
        for(int i=0; i<= Mnumero.length; i++){
            int multi = i * usu;
            System.out.println(usu +"x"+i+"="+multi);
        }
    }
}

