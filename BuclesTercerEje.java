import java.time.LocalDate;
import java.util.Scanner;
public class BuclesTercerEje {
    public static void main(String[] args) {
        //Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad= sc.nextInt();

        int annoActual = LocalDate.now().getYear();//obtener el año actual
        int annoNaci = annoActual - edad;// año de nacimiento

        for(int i=1; i<=edad;i++){
            annoNaci++; // Suma 1 año a el annoNaci hasta el año actual
            System.out.println("En el año "+annoNaci+" ha cumplido "+i);
        }
    }
}
