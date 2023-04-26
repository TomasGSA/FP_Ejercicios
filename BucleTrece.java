import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BucleTrece {
    /**Cree un programa que indique si una palabra metida por teclado es un palíndromo*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        String palabraInvertida = "";

        for(int i = 0;i < palabra.length();i++){
            char letras = palabra.charAt(i);
            System.out.print(letras);
        }
        System.out.print("\n");

        for (int i = palabra.length()-1;i >= 0;i--){
            char letras = palabra.charAt(i);
            System.out.print(letras);
            palabraInvertida += letras;
        }

        if(palabra.equals(palabraInvertida)){
            System.out.print("\nla palabra es palindromo");
        }else{
            System.out.println("\nla palabra no es palindromo");
        }

        sc.close();
    }
}
/** for (int i = palabra.length()-1; i>=0; i--){
 palabraInvertida += palabra.charAt(i);
 }

 if(palabraInvertida.equals(palabra)){
 System.out.println("La plabra es palindromo");
 }else{
 System.out.println("La palabra no es palindromo");
 }
 }*/