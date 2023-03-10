import java.util.Scanner;
public class CorrectoSNPApp {
    public static void main(String[] args) {
    //Programa que imprima correcto si se introducen los caracteres S, N o punto.
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String texto = sc.next();
        boolean correcto = false;
        for(int i=0; i < texto.length(); i++){
            char c = texto.charAt(i);
            // si contiene cualquiera de esos caracteres es true
            if((c == 's' || c == 'S') || (c == 'n' || c == 'N') || (c == '.')) {
                correcto = true;
            }else{
                correcto = false;
            }
        }
        if(correcto = true){
            System.out.println("Es correcto");
        }else{
            System.out.println("Incorrecto");
        }

    }

}

