import java.util.Scanner;
public class BuclesSASieteEje {
    public static void main(String[] args) {
        //Pide al usuario por teclado una frase y pasa sus caracteres a un array
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase ingresada es: "+frase);
        char[] aCara = frase.toCharArray();

        for(int i = 0; i <= aCara.length; i++){
            System.out.println(aCara[i]);

        }

    }
}
