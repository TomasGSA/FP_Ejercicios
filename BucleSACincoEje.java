import java.util.Scanner;
public class BucleSACincoEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        int altura = sc.nextInt();

        for (int i = altura; i > 0 ; i--) {
            // Bucle que itera el tamaño de la piramide
            for(int x = 1; x <= altura - i; x++){
                //Bucle que itera los espacios en blanco antes de cada '*'
                System.out.print(" ");
            }
            for(int z=1; z <= 2*i-1;z++){
                // Bucle que itera sobre cada astericos que debe imprimer en la fila actual.
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
