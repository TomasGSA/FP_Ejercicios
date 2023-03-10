import java.util.Scanner;
public class MesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 - 12 ");
        int numMes = sc.nextInt();
        String nomMes = null;

        switch (numMes){
            case 1:
                nomMes = "Enero";
                break;
            case 2:
                nomMes = "Febreo";
                break;
            case 3:
                nomMes = "Marzo";
                break;
            case 4:
                nomMes = "Abril";
                break;
            case 5:
                nomMes = "Mayo";
                break;
            case 6:
                nomMes = "Junio";
                break;
            case 7:
                nomMes = "Julio";
                break;
            case 8:
                nomMes = "Agosto";
                break;
            case 9:
                nomMes = "Septiembre";
                break;
            case 10:
                nomMes = "Octubre";
                break;
            case 11:
                nomMes = "Noviembre";
                break;
            case 12:
                nomMes = "Diciembre";
                break;
            default:
                System.out.println("Numero no soportado");
        }
        System.out.println("El mes es "+ nomMes);
    }
}
