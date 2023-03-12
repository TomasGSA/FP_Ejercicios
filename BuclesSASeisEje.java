import java.util.Scanner;
public class BuclesSASeisEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la medida de la mitad diagonal: ");
        int mitad = sc.nextInt();

        //Parte superior
        for(int i = 1; i <= mitad; i++){
            for(int x = 1; x <= mitad - i; x++){
                //Bucle que itera los espacios en blanco antes de cada '*'
                System.out.print(" ");
            }
            for(int z=1; z <= 2*i-1;z++){
                // Bucle que itera sobre cada astericos que debe imprir en la fila actual.
                System.out.print("*");
            }
            System.out.println();
        }
            //Parte inferior
        for(int i = mitad - 1;i >= 1; i--){
            for(int x = 1; x <= mitad - i; x++){
                //Bucle que itera los espacios en blanco antes de cada '*'
                System.out.print(" ");
            }
            for(int z=1; z <= 2*i-1;z++){
                // Bucle que itera sobre cada astericos que debe imprir en la fila actual.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
