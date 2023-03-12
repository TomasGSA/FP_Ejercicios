import java.util.Scanner;
public class BuclesSADosEje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int altura = sc.nextInt();
        
        for(int i = altura;i>0; i--){
            for(int x = 1; x<=i;x++){
                System.out.print(i);
            }
            System.out.println();
            sc.close();
        }
    }
}
